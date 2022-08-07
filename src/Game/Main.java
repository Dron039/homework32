package Game;

import java.util.*;

public class Main {

    private static List<Gamer> gamers = new ArrayList<>();
    public static void main(String[] args) {
        greateDefaultGamers();

      try  (Scanner scanner = new Scanner(System.in)) {
          String username = "";
          boolean isValidUsername = false;
          while(!isValidUsername) {
              System.out.println("Укажите Ваш ник:");
              username = scanner.nextLine();
              for (Gamer gamer : gamers) {
                  if (gamer.getUsername().equals(username) || gamers.isEmpty()) {
                      System.out.println("Игрок с таким именем уже есть");
                      isValidUsername = false;
                      break;
                  } else {
                      isValidUsername = true;
                  }
              }

          }
          System.out.println("Укажите список игр через пробел:");
          printGameType();
          String gameList = scanner.nextLine();
          String[] gameListArray = gameList.split(" ");
          Map<Game, Long> userGameRating = new HashMap<>();

          for (String currentGameId : gameListArray) {
             Optional<Game> optionalGame = Optional.ofNullable(Game.getEnumById(Long.valueOf(currentGameId)));
             optionalGame.ifPresent(game -> userGameRating.put(game, 0L));
          }
          Gamer gamer = new Gamer(username, userGameRating);
          gamers.add(gamer);

    }catch (Exception e) {
          System.out.println(e.getStackTrace());
      }
    }

    private static void greateDefaultGamers() {
        Gamer gamerAdmin = new Gamer("admin", Collections.singletonMap(Game.CHESS, 1000L));
        gamers.add(gamerAdmin);
        Gamer gamerModerator = new Gamer("moderator", Collections.singletonMap(Game.SNAKE, 5500L));
        gamers.add(gamerModerator);
    }

    private static void printGameType() {
        System.out.println("Введите номера игр через пробел:");
        System.out.println(getGames());
    }

    private static String getGames() {
        return Arrays.toString(Game.values())
                .replace("[","")
                .replace("]","")
                .replace(",","")
                .trim();

    }
}
