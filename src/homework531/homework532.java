package homework531;

public class homework532 {
    public static void main(String[] args) {
     int[] mat = new int[20];
     boolean FirstNegativeNumber = false;
     int sum = 0;
     for (int i = 0;i < mat.length;i++) {
         mat[i] = (int)(Math.random() * -10) + (int)(Math.random() * 30);
               if (!FirstNegativeNumber && mat[i] < 0) {
                   FirstNegativeNumber = true;
                   continue;
           }
               if (FirstNegativeNumber) {
                   sum += mat[i];
               }
         System.out.println(mat[i]);
     }
        System.out.println("сумма - " + sum);
//     10
//        20
//        5
//        13
//        7
//        5
//        23
//        3
//        2
//        1
//        4
//        20
//        29
    }
}
