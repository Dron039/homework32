package Game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Gamer> gamers;
    public static void main(String[] args) {
        greateDefaultGamers();

      try  (Scanner scanner = new Scanner(System.in)) {
          while(true) {
              System.out.println("Укажите Ваш ник:");
              String username = scanner.nextLine();


              break;
          }
          System.out.println("Укажите список игр:");
          printGameType();
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
        System.out.println("Введите номер пункта игры:");
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
