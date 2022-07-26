package homework721;

public enum MethodPay {

    RATE("ставка"),
    HOUR("почасовая"),
    BY_WORK("сдельная");

    private final String descRus;

    MethodPay(String descRus) {
        this.descRus = descRus;
    }
    public String getDescRus() {
        return descRus;
    }
}
