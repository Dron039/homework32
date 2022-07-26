public class homework328 {
    public static void main(String[] args) {
        int h = 0b1101;
        int number = h;
        int s = 0;

        for (int i = 1;i < 32;i++) {
            number = number >> i;
            if (number == 0) {
                s = i;
                break;
            }
                }
        int mask = (int) Math.pow(2, s);

        System.out.println(Integer.toBinaryString(h ^ mask));
    }
}
