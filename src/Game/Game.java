package Game;

public enum Game {

    COUNTER_STRIKE("counter_strike"),
    SNAKE("snake"),
    MINECRAFT("minecraft"),
    CHESS("chess"),
    PAINTBALL("paintball");

    private final String name;

    Game(String name) {
        this.name = name;
    }

    public static Game getEnumByNumber(String name) {
        for (Game value : values()) {
            if (value.name.equals(name)) {
                return value;
            }
        }return null;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("\n");
        return sb.toString();
    }
}
