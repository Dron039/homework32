package homework621;

public class homework621 {
    public static void main(String[] args) {
        printNumbers(1, 5);
    }

    private static void printNumbers(int a,int b){
        if (a < b) {
            System.out.println(a);
            printNumbers(a + 1,b);
        }
        if (a > b) {
            System.out.println(a);
            printNumbers(a - 1, b);
        }
        if (a==b) {
            System.out.println(a);
        }
    }
}
