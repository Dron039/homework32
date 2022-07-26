package homework521;

public class homework524 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5, 2, 6, 7, 8};
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] != mas[j]) {

                    System.out.println(" YES");
                } else {
                    System.out.println(mas[i] + " NO");
                }
            }
        }
    }
}