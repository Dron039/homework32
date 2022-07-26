public class homework3210 {
    public static void main(String[] args) {
        int m = 0b1010110;
        int n = 0b1001110;

        System.out.println(Integer.toBinaryString(~m << 28));
        System.out.println(Integer.toBinaryString(~n << 28));
    }
}
