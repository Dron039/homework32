package Game;

public enum Game {

    COUNTER_STRIKE(1L,"counter_strike"),
    SNAKE(2L,"snake"),
    MINECRAFT(3L,"minecraft"),
    CHESS(4L,"chess"),
    PAINTBALL(5L,"paintball");


    private final Long id;
    private final String name;
    Game(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    public static Game getEnumById(Long id) {
        for (Game value : values()) {
            if (value.id.equals(id)) {
                return value;
            }
        }return null;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(id).append(". ");
        sb.append(name).append("\n");
        return sb.toString();
    }
}
