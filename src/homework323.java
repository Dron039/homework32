public class homework323 {
    public static void main(String[] args) {
        int h = 0b101000100;

        h = h ^ 1 << 2;


        System.out.println(Integer.toBinaryString(h));
    }
}
