package homework713;

public class homework713 {
    public static void main(String[] args) {

        Money money1 = new Money();
        money1.setGrivna(10);
        money1.setKopecks((byte) 89);

        Money money2 = new Money();
        money2.setGrivna(20);
        money2.setKopecks((byte) 41);

        System.out.println(Money.diff(money2,money1));

    }
}
