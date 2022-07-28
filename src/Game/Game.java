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
}
