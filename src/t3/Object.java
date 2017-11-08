package t3;

import java.util.HashMap;
import java.util.Map;

class Object {
    private String name;
    private HashMap<String, String> variables;
    private HashMap<String, String> events;

    public HashMap<String, String> getVariables() {
        return variables;
    }

    public HashMap<String, String> getEvents() {
        return events;
    }

    Object (TableGameData table) {
        // Nome do objeto é o IDENT vindo do .dungeon
        this.name = table.getTableName();
        this.variables = new HashMap<>();
        this.events = new HashMap<>();

        // Variáveis
        for (GameData data : table.getDatas()) {
            switch (data.getType()) {
                // Variáveis
                case "Variable":
                    // Adiciona as variáveis do Object no formato chave:valor
                    this.variables.put(data.getName(), data.getValue());
                    break;
                // Objetos
                case "Event":
                    // Adiciona os nomes (object.name) dos Objects da Room
                    this.events.put(data.getName(), data.getValue());
                    break;
            }
        }
    }

    @Override
    public String toString() {
        String string = this.name+"\nVariáveis:\n";
        for (Map.Entry<String, String> var : this.variables.entrySet())
            string += var.getKey()+": "+var.getValue()+"\n";

        return string;
    }
}
