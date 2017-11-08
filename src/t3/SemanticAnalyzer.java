package t3;

import org.antlr.v4.runtime.tree.TerminalNode;

class SemanticAnalyzer extends dungeonBaseVisitor<GameData> {
    private ListTables rooms;
    private ListTables objects;

    // Variável auxiliar para recuperar a tabela atual
    private TableGameData table;

    ListTables getRooms() {
        return rooms;
    }

    public ListTables getObjects() {
        return objects;
    }

    @Override
    public GameData visitProgram(dungeonParser.ProgramContext ctx) {
        // Inicia as listas rooms/objects
        this.rooms = new ListTables();
        this.objects = new ListTables();

        super.visitProgram(ctx);

        // Verificar se as Rooms utilizadas em moves foram declaradas
        for (TableGameData room : this.rooms.getTables()) {
            // Procura por um GameData do tipo Room_Instance
            for (GameData data : room.getDatas()) {
                if (data.getType().equals("Room_Instance")) {
                    // Procura na list de Rooms se existe uma Room com o nome da Room_Instance
                    if (!this.rooms.itHas(data)) {
                        // Caso não encontre então é gerado um erro
                        System.out.println("A Room_Instance \""+data.getName()+"\" utilizada na direção \""+data.getDirection()+"\" da Room \""+table.getTableName()+"\" não foi declarada");
                    }
                }
            }
        }

        return null;
    }

    // Criar uma TableGameData para o Object visitado
    // A tabela criada é guardada em table para que possa ser recuperada posteriormente
    @Override
    public GameData visitObject(dungeonParser.ObjectContext ctx) {
        // Verifica se já existe um Object com esse nome
        if (this.objects.itHas(ctx.IDENT())) {
            // Caso um Object já tenha sido declarado com esse nome
            System.out.println("Já existe uma declaração de Object com o nome \""+ctx.IDENT().getText()+"\"");

        } else {
            // Cria uma nova tabela para o Object e atribui a tabela atual table
            this.table = new TableGameData(ctx.IDENT().getText());
            this.objects.addTable(table);
        }

        visitObject_body(ctx.object_body());

        return null;
    }

    // Visita cada Variableiável dentro de object_body e retorna um GameData
    // Verifica se o GameData já existe na tabela, gerando um erro caso já exista
    @Override
    public GameData visitObject_body(dungeonParser.Object_bodyContext ctx) {
        // Visitar as variáveis do Object
        visitVars_object(ctx.vars_object());

        // Visitar os eventos disponivéis para o Object
        visitEvents(ctx.events());

        return null;
    }

    @Override
    public GameData visitVars_object(dungeonParser.Vars_objectContext ctx) {
        // Se 'name' declarado visita
        if (ctx.name() != null)
            this.table.addGameData(new GameData("name", "Variable", null, ctx.name().value().getText()));
        // Senão usa o valor default
        else
            this.table.addGameData(new GameData("name", "Variable", null, table.getTableName()));

        // Se 'description' declarado visita
        if (ctx.description() != null)
            this.table.addGameData(new GameData("description", "Variable", null, ctx.description().value().getText()));
        // Senão usa o valor default
        else
            this.table.addGameData(new GameData("description", "Variable", null, table.getTableName()));

        // Se 'visible' declarado visita
        if (ctx.visible() != null)
            this.table.addGameData(new GameData("visible", "Variable", null, ctx.visible().value().getText()));
        // Senão usa o valor default
        else
            this.table.addGameData(new GameData("visible", "Variable", null, "1"));

        // Se 'empty' declarado visita
        if (ctx.empty() != null)
            this.table.addGameData(new GameData("empty", "Variable", null, ctx.empty().value().getText()));
        // Senão usa o valor default
        else
            this.table.addGameData(new GameData("empty", "Variable", null, "1"));

        return null;
    }

    @Override
    public GameData visitEvents(dungeonParser.EventsContext ctx) {
	// Verifica se o Event open foi declarado
        if (ctx.open() != null)
	    // Verifica se o Object definido no open foi declarado
            if (this.objects.itHas(ctx.open().IDENT()))
                this.table.addGameData(new GameData("open", "Event", null, ctx.open().IDENT().getText()));
	    // Caso contrário exibe um erro
	    else
                System.out.println("Object \"" + ctx.open().IDENT().getText() + "\" utilizado no Event \"open\" do Object \"" + this.table.getTableName() + "\" não foi declarado");
	// Verifica se o Event get foi declarado e adiciona no Object
	if (ctx.get() != null)
	    this.table.addGameData(new GameData("get", "Event", null, null));

	// Verifica se o Event drop foi declarado e adiciona no Object
	if (ctx.drop() != null)
	    this.table.addGameData(new GameData("drop", "Event", null, null));

        return null;
    }

    // Criar uma TableGameData para o Room visitado
    // A tabela criada é guardada em table para que possa ser recuperada posteriormente
    @Override
    public GameData visitRoom(dungeonParser.RoomContext ctx) {
        // Verifica se já existe uma Room com esse nome
        if (this.rooms.itHas(ctx.IDENT())) {
            // Caso uma Room já tenha sido declarada com esse nome
            System.out.println("Já existe uma declaração de Room com o nome \""+ctx.IDENT().getText()+"\"");

        } else {
            // Cria uma nova tabela para o Room e atribui a tabela atual table
            this.table = new TableGameData(ctx.IDENT().getText());
            this.rooms.addTable(table);
        }

        visitRoom_body(ctx.room_body());

        return null;
    }

    // Visita cada Variableiável dentro de room_body e retorna um GameData
    // Verifica se o GameData já existe na tabela, gerando um erro caso já exista
    @Override
    public GameData visitRoom_body(dungeonParser.Room_bodyContext ctx) {
        // Visita as Variableiáveis de Room
        visitVars_room(ctx.vars_room());

        // Visitar moves
        visitMoves(ctx.moves());

        // Visitar objects
        visitObjects(ctx.objects());

        return null;
    }

    @Override
    public GameData visitVars_room(dungeonParser.Vars_roomContext ctx) {
        // Se 'name' declarado visita
        if (ctx.name() != null)
            this.table.addGameData(new GameData("name", "Variable", null, ctx.name().value().getText()));
            // Senão usa o valor default
        else
            this.table.addGameData(new GameData("name", "Variable", null, table.getTableName()));

        // Se 'description' declarado visita
        if (ctx.description() != null)
            this.table.addGameData(new GameData("description", "Variable", null, ctx.description().value().getText()));
            // Senão usa o valor default
        else
            this.table.addGameData(new GameData("description", "Variable", null, table.getTableName()));

        return null;
    }

    // Adiciona um GameData com as informações de movimentação (norte)
    @Override
    public GameData visitNorth(dungeonParser.NorthContext ctx) {
        if (ctx.locked() != null)
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "North", "Locked"));
        else
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "North", "Open"));

        return null;
    }

    // Adiciona um GameData com as informações de movimentação (sul)
    @Override
    public GameData visitSouth(dungeonParser.SouthContext ctx) {
        if (ctx.locked() != null)
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "South", "Locked"));
        else
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "South", "Open"));

        return null;
    }

    // Adiciona um GameData com as informações de movimentação (leste)
    @Override
    public GameData visitEast(dungeonParser.EastContext ctx) {
        if (ctx.locked() != null)
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "East", "Locked"));
        else
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "East", "Open"));

        return null;
    }

    // Adiciona um GameData com as informações de movimentação (oeste)
    @Override
    public GameData visitWest(dungeonParser.WestContext ctx) {
        if (ctx.locked() != null)
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "West", "Locked"));
        else
            this.table.addGameData(new GameData(ctx.IDENT().getText(), "Room_Instance", "West", "Open"));

        return null;
    }

    // Verifica para cada Object utilizado dentro de Room se ela foi declarada
    @Override
    public GameData visitObjects(dungeonParser.ObjectsContext ctx) {
        if(ctx != null) {
            for (TerminalNode node : ctx.IDENT()) {
                // Verificar se o objeto dentro da sala foi instânciado
                if (this.objects.itHas(node)) {
                    this.table.addGameData(new GameData(node.getText(), "Object_Instance", null, null));

                } else {
                    // Erro caso o objeto não tenha sido declarado
                    System.out.println("Object_Instance \"" + node.getText() + "\" utilizado na Room " + this.table.getTableName() + " não foi declarado");
                }
            }
        }
        return null;
    }
}
