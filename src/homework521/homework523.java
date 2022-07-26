package homework521;

public class homework523 {
    public static void main(String[] args) {
        int[] mas = {1,2,3,4,1,2,2,6,6};
        for (int i = 0;i < mas.length;i++) {
            for (int j = i + 1 ;j < mas.length;j++){
                if (mas[i] == mas[j]) {

                    System.out.println(mas[i] + " YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }
}
