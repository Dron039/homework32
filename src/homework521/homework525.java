package homework521;

public class homework525 {
    public static void main(String[] args) {
        int[] mas = new int[11];
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * -10) + (int) (Math.random() * 10);
            for (int j = i + 1;j < mas.length;j++) {
                if (mas[i] == mas[j]) {
                    count++;

                }
                System.out.println(mas[i] + " повторений " + count);
            }
        }
    }
}
