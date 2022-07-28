package Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      try  (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Укажите Ваш ник:");
          String username = scanner.nextLine();
    }catch (Exception e) {
          System.out.println(e.getStackTrace());
      }
    }
}
