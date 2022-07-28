package Game;

import java.util.HashMap;
import java.util.Map;

public class Gamer {

    private String username;
    private Map<Game, Long> gameRating;

    public Gamer(String username, Map<Game, Long> gameRating) {
        this.username = username;
        this.gameRating = gameRating;
    }

    public Gamer() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public HashMap<Game, Long> getGameRating() {
        return gameRating;
    }

    public void setGameRating(HashMap<Game, Long> gameRating) {
        this.gameRating = gameRating;
    }


}
