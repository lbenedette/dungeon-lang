package t3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    private String name;
    private HashMap<String, String> variables;
    private List<String> objects;
    private HashMap<String, String[]> moves;


    public String getName () {
        return this.name;
    }

    HashMap<String, String> getVariables() {
        return variables;
    }

    public HashMap<String, String[]> getMoves() {
        return moves;
    }

    public List<String> getObjects() {
        return objects;
    }

    Room (TableGameData table) {
        this.name = table.getTableName();
        this.variables = new HashMap<>();
        this.objects = new ArrayList<>();
        this.moves = new HashMap<>();

        // Adiciona as variáveis/objetos/moves do Room
        for (GameData data : table.getDatas()) {
            switch (data.getType()) {
                // Variáveis
                case "Variable":
                    // Adiciona as variáveis do Object no formato chave:valor
                    this.variables.put(data.getName(), data.getValue());
                    break;
                // Objetos
                case "Object_Instance":
                    // Adiciona os nomes (object.name) dos Objects da Room
                    this.objects.add(data.getName());
                    break;
                // Moves
                case "Room_Instance":
                    // Adiciona os moves no formato direction:room
                    this.moves.put(data.getDirection(), new String[]{data.getValue(), data.getName()});
                    break;
            }
        }
    }

    @Override
    public String toString() {
        String string = this.name+"\nVariáveis:\n";
        for (Map.Entry<String, String> var : this.variables.entrySet())
            string += var.getKey()+": "+var.getValue()+"\n";

        string += "Moves:\n";

        for (Map.Entry<String, String[]> var : this.moves.entrySet())
            string += var.getKey()+" => "+var.getValue()[1]+"\n";

        return string;
    }
}
