package homework521;



public class homework522 {
    public static void main(String[] args) {
        int[] mas = new int[31];
        int min = mas[0];
        int max = mas[30];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * -70) + (int) (Math.random() * 50);
            if (mas[i] < min)
                min = mas[i];
            if (mas[i] > max)
                max =mas[i];
            System.out.println(min);
            System.out.println(max);
        }
//
//
//
    }
}

