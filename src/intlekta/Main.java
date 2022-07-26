package intlekta;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Integer a = 10000;
       Integer b = 10000;
       Integer c = 100;
       Integer d = 100;
       int e = 10000;
       int f = 100;

        System.out.printf("%b %b %b %b %b %b", a==e, b==e, a==b, c==f, d==f, c==d);
    }
}
