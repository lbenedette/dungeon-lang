package t3;

class GameData {
    private String name;
    private String type;
    private String direction;
    private String value;

    GameData(String name, String type, String direction, String value) {
        this.name = name;
        this.type = type;
        this.direction = direction;
        this.value = value;
    }

    // Nome ou Identificador do Token
    // - var: Nome da variável
    // - move: Nome da sala
    // - object: Nome do objeto
    String getName() {
        return name;
    }

    // Tipo do Token
    //  - var: Variável de sala/objeto
    //  - move: Usada para salas (saídas ou movimentos)
    //  - object: Objetos declarados da sala
    public String getType() {
        return type;
    }

    // Usado somente no caso de um Token do tipo move:
    // Indica a direção: norte, sul, leste e oeste
    public String getDirection() {
        return direction;
    }

    // Valor do Token:
    //  - var: Valor (em string) da variável
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "("+this.name+", "+this.type+", "+this.direction+", "+this.value+")";
    }
}
