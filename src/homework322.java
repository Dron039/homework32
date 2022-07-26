public class homework322 {
    public static void main(String[] args) {
        int y = 2;

        for (int i = 0;i < 5;i++) {
            System.out.println("2 в степени " + i + " равно - " +((y >> 1) << i));
        }
    }
}
