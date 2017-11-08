package t3;

import java.util.ArrayList;
import java.util.List;

class TableGameData {
    private String table_name;
    private List<GameData> datas;

    TableGameData(String table_name) {
        this.datas = new ArrayList<GameData>();
        this.table_name = table_name;
    }

    public String getTableName() {
        return table_name;
    }

    public List<GameData> getDatas() {
        return datas;
    }

    // Função para adicionar elementos na tabela (construtor)
    public void addGameData(String name, String type, String direction, String value) {
        this.datas.add(new GameData(name, type, direction, value));
    }

    // Função para adicionar elementos na tabela (GameData)
    void addGameData(GameData game_data) {
        this.datas.add(game_data);
    }

    boolean itHas(GameData new_data) {
        for (GameData game_data : this.datas)
            if (game_data.getName().equals(new_data.getName()))
                return true;

        return false;
    }

    @Override
    public String toString() {
        String string = this.table_name + ":\n";
        for (GameData game_data : this.datas)
            string += game_data.toString() + "\n";

        return string;
    }
}
