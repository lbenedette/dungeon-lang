package t3;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

class ListTables {
    private List<TableGameData> tables;

    ListTables() {
        this.tables = new ArrayList<TableGameData>();
    }

    List<TableGameData> getTables() {
        return this.tables;
    }

    // Adiciona uma nova tabela
    void addTable(TableGameData table) {
        this.tables.add(table);
    }

    // Verifica se existe o Token existe na lista de tabelas
    boolean itHas(TerminalNode token) {
        for (TableGameData table : this.tables)
            if (table.getTableName().equals(token.getText()))
                return true;

        return false;
    }

    // Verifica se existe o GameData existe na lista de tabelas
    // Usado para verificar se um Room_Instance foi declarado
    boolean itHas(GameData data) {
        for (TableGameData table : this.tables)
            if (table.getTableName().equals(data.getName()))
                return true;

        return false;
    }

    @Override
    public String toString() {
        String string = "";
        for (TableGameData table : this.tables)
            string += table.toString() + "\n\n";
        return string;
    }
}
