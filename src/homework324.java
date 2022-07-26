
import java.util.Scanner;

public class homework324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int numberUser = scanner.nextInt();
        System.out.println("Число в двоичном виде: " + Integer.toBinaryString(numberUser));
        System.out.print("Введите бит от 1 до 32 числа, который вы бы хотели инвертировать: ");
        int answerUserBit = scanner.nextInt();

        answerUserBit = (int) Math.pow(2, answerUserBit - 1);
        System.out.println(Integer.toBinaryString(numberUser + answerUserBit));


        System.out.println("Результат в десятичном виде " + (numberUser ^ answerUserBit));
        System.out.println("Результат в двоичном виде: " + Integer.toBinaryString(numberUser ^ answerUserBit));
    }
}
