package t3;

import java.util.*;

public class DungeonCrawler {
    private HashMap<String, Object> objects;
    private HashMap<String, Room> rooms;
    private Room actual;
    private List<String> commands;
    private HashMap<String, Object> bag;

    DungeonCrawler (ListTables objects, ListTables rooms) {
        this.objects = new HashMap<>();
        this.rooms = new HashMap<>();

        // Adiciona na lista de comandos os comandos básicos
        this.commands = new ArrayList<>(Arrays.asList("see", "north", "south", "east", "west", "open", "get", "drop", "help", "exit"));

        // A primeira Room é a primeira declarada no código
        this.actual = new Room(rooms.getTables().get(0));

        // Simulação de um inventário
        this.bag = new HashMap<>();

        // Carrega os Objects
        for (TableGameData table : objects.getTables()) {
            this.objects.put(table.getTableName(), new Object(table));
        }

        // Carrega os Rooms
        for (TableGameData table : rooms.getTables()) {
            this.rooms.put(table.getTableName(), new Room(table));
        }
    }

    // TODO: Compilador para os comandos
    private void commandsParse(String[] tokens) {
        // Verificar se a primeira palavra digitada faz parte dos comandos
        String command = tokens[0];
        String target;

        // Descobrir o comando e executar a função correspondente
        switch (command) {
            case "see":
                target = (tokens.length >= 2) ? tokens[1] : null;
                this.see(target);
                break;
            // Qualquer comando de movimento usa a mesma função
            // Passando como parâmetro a direção (command)
            case "north":
                this.move("North");
                break;
            case "south":
                this.move("South");
                break;
            case "east":
                this.move("East");
                break;
            case "west":
                this.move("West");
                break;
            case "open":
                target = (tokens.length >= 2) ? tokens[1] : null;
                this.open(target);
                break;
            case "get":
                target = (tokens.length >= 2) ? tokens[1] : null;
                this.get(target);
                break;
            case "drop":
                target = (tokens.length >= 2) ? tokens[1] : null;
                this.drop(target);
                break;
            case "help":
                this.help();
                break;
            case "exit":
                break;
            default:
                System.out.println("Invalid command! Type help to get a list of commands.");
                break;
        }
    }

    private void see (String target) {
        // Avaliar o que o usuário esta "vendo"
        // O comando 'see' sem target é aplicado a Room
        if (target == null) {
            String string = "";
            string += this.actual.getVariables().get("name") + '\n';
            string += this.actual.getVariables().get("description") + '\n';
            string += "Moves: ";

            for (Map.Entry<String, String[]> var : this.actual.getMoves().entrySet()) {
                switch (var.getKey()) {
                    case "North":
                        string += "north ";
                        break;
                    case "South":
                        string += "south ";
                        break;
                    case "East":
                        string += "east ";
                        break;
                    case "West":
                        string += "west ";
                        break;
                }
            }

            string += "\n";

            for (String object : this.actual.getObjects()) {
                if (this.objects.get(object).getVariables().get("visible").equals("1"))
                    string += "There a "+object+" here\n";
            }
            string += "\n";

            System.out.print(string);

        // É possível utilizar o comando 'see' para ver objetos ou saídas (moves)
        } else {
            // Verificar se é uma saída
            if (target.equals("north") || target.equals("south") || target.equals("east") || target.equals("west")) {
                String move = "";
                switch (target) {
                    case "north":
                        move = this.actual.getMoves().get("North")[1];
                        break;
                    case "south":
                        move = this.actual.getMoves().get("South")[1];
                        break;
                    case "east":
                        move = this.actual.getMoves().get("East")[1];
                        break;
                    case "west":
                        move = this.actual.getMoves().get("West")[1];
                        break;
                }

                if (move != null) {
                    System.out.println(this.rooms.get(move).getVariables().get("name"));

                } else {
                    System.out.println("You can not look to this way!");
                }
            // Verificar se é algum objeto da sala
            } else if (this.actual.getObjects().contains(target)) {
                if (this.objects.get(target).getVariables().get("visible").equals("0")) {
                    System.out.println("You can not see this.");
                    return;
                }

                System.out.println(this.objects.get(target).getVariables().get("description"));

            } else {
                System.out.println("You can not see this.");
            }
        }
    }

    // Função para movimentação
    // Caso a direção informada não seja válida, uma mensagem é enviada para o usuário
    private void move (String direction) {
        String[] room = this.actual.getMoves().get(direction);

        // Verifica se é possível seguir na direção informada
        if (room == null) {
            System.out.println("You can not walk in that direction!");
            return;
        }

        String next_room = this.actual.getMoves().get(direction)[1];
        boolean locked = (this.actual.getMoves().get(direction)[0].equals("Locked"));

        // Verifica se é possível seguir na direção informada
        if (next_room == null) {
            System.out.println("You can not walk in that direction!");
            return;
        }

        // Verifica se a sala esta trancada
        if (locked) {
            System.out.println("Locked!");
            return;
        }

        // Atualiza a sala atual
        this.actual = this.rooms.get(next_room);
        System.out.println(this.actual.getVariables().get("name"));
    }

    private void open(String target) {
        if (target == null) {
            System.out.println("Open what?");
            return;
        }

        // Verifica se o target é um move e se esta fechada
        if (target.equals("north") || target.equals("south") || target.equals("east") || target.equals("west")) {
            String[] move = new String[]{};
            switch (target) {
                case "north":
                    move = this.actual.getMoves().get("North");
                    break;
                case "south":
                    move = this.actual.getMoves().get("South");
                    break;
                case "east":
                    move = this.actual.getMoves().get("East");
                    break;
                case "west":
                    move = this.actual.getMoves().get("West");
                    break;
            }

            if (move != null) {
                if (move[0].equals("Locked")) {
                    move[0] = "Unlocked";
                    System.out.println("You open it!");

                }

            } else {
                System.out.println("This direction are already unlocked!");
            }

        } else {
            // Object existe na sala
            if (this.actual.getObjects().contains(target)) {
                if (this.objects.get(target).getVariables().get("visible").equals("0")) {
                    System.out.println("Open what?");
                    return;
                }

                // Verifica se existe o evento open no object
                String event = this.objects.get(target).getEvents().get("open");
                if (event != null) {
                    // Torna visivel o Object dentro da sala
                    Object obj = this.objects.get(event);
                    obj.getVariables().replace("visible", "1");
                    System.out.println("You found a "+event);
                    this.objects.get(target).getEvents().remove("open");

                } else {
                    System.out.println("You can not open this");
                }

            } else {
                System.out.println("Open what?");
            }
        }
    }

    private void get(String target) {
        if (target == null) {
            System.out.println("Get what?");
            return;
        }

        if (this.actual.getObjects().contains(target)) {
            if (this.objects.get(target).getVariables().get("visible").equals("0")) {
                System.out.println("Get what?");
                return;
            }

            // Verifica se existe o evento open no object
            if (this.objects.get(target).getEvents().containsKey("get")) {
                // Adiciona o Object na bag e remove da sala
                Object obj = this.objects.get(target);
                this.bag.put(target, obj);
                this.actual.getObjects().remove(target);
                System.out.println("You get a "+target);

            } else {
                System.out.println("You can not get this");
            }

        } else {
            System.out.println("Get what?");
        }
    }

    private void drop (String target) {
        if (target == null) {
            System.out.println("Drop what?");
            return;
        }

        //Verificar se o objeto existe na bag
        if (this.bag.containsKey(target)) {

            // Verifica se existe o evento drop no object
            if (this.bag.get(target).getEvents().containsKey("drop")) {
                // Adiciona o Object na bag e remove da sala
                Object obj = this.bag.get(target);
                this.bag.remove(target);
                this.actual.getObjects().add(target);
                System.out.println("You drop a "+target);

            } else {
                System.out.println("You can not drop this");
            }

        } else {
            System.out.println("drop what?");
        }
    }

    private void help () {
        for (String command : this.commands)
            System.out.println(command);
    }

    void run () {
        System.out.println(this.actual.getVariables().get("name"));
        Scanner prompt = new Scanner(System.in);

        String[] tokens;
        do {
            System.out.print(':');
            tokens = prompt.nextLine().split(" ");
            commandsParse(tokens);
        } while (!tokens[0].equals("exit"));
    }
}
