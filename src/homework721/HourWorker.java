package homework721;


public class HourWorker extends Worker {

    private Integer hourCount;

    public HourWorker(Integer hourCount) {
        this.hourCount = hourCount;
        this.setMethodPay(MethodPay.HOUR);
    }
}
