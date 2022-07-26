package homework611;

public class homework611 {

    public static void main(String[] args) {
        oneMatrix();
        zeroMatrix();
        plusMatrix();
        multiplicationMatrix();

    }


    public static void oneMatrix() {
        int[][] matrix = {{7, 0, 0}, {0, 7, 0}, {0, 0, 7}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void zeroMatrix() {
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void plusMatrix() {
        int[][] matrix = new int[5][5];
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];
        System.out.println("matrix :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20 + 1);

                System.out.print(" " + matrix[i][j]);

            }
            System.out.println();
        }
        System.out.println("matrix1 :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 20 + 1);

                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("matrix + matrix1 :");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = matrix[i][j] + matrix1[i][j];

                System.out.print(" " + matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void multiplicationMatrix() {
        int[][] matrix = new int[5][5];
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];
        System.out.println("matrix :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20 + 1);

                System.out.print(" " + matrix[i][j]);

            }
            System.out.println();
        }
        System.out.println("matrix1 :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 20 + 1);

                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("matrix * matrix1 :");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = matrix[i][j] * matrix1[i][j];

                System.out.print(" " + matrix2[i][j]);
            }
            System.out.println();
        }

    }



    }
