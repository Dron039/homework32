public class homework326 {
    public static void main(String[] args) {
        int h = 0b10100;

        h = h ^ 16;

        System.out.println(Integer.toBinaryString(h ^ (int) Math.pow(2, 2)));
    }
}
