package homework713;

public class Money {
    public static final int KOPECS_IN_GRIVNA = 100;
    private long grivna;
    private byte kopecks;

    public Money() {

    }

    public long getGrivna() {
        return grivna;
    }

    public Money(long grivna, byte kopecks) {
        this.grivna = grivna;
        this.kopecks = kopecks;
    }


    public void setGrivna(long grivna) {
        this.grivna = grivna;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public static Money sum(Money money1, Money money2) {
        long sumGrivna = money1.getGrivna() + money2.getGrivna();
        int sumKopecs = (int)money1.getKopecks() + (int)money2.getKopecks();
        sumGrivna += sumKopecs / KOPECS_IN_GRIVNA;
        sumKopecs = sumKopecs % 100;
        return new Money(sumGrivna,(byte) sumKopecs);
    }

    public static Money diff(Money money1, Money money2) {
        long diffGrivna = money1.getGrivna() - money2.getGrivna();
        int diffKopecs = (int)money1.getKopecks() - (int)money2.getKopecks();
        diffGrivna -= diffKopecs / KOPECS_IN_GRIVNA;

        if (diffKopecs < 0) {
            diffGrivna--;
            diffKopecs = 100 + diffKopecs % 100;
        }
        return new Money(diffGrivna,(byte) diffKopecs);



    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(grivna);
        sb.append(",");
        sb.append(kopecks);
        return sb.toString();
    }
}


