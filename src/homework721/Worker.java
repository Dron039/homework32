package homework721;

public abstract class Worker {

    private String fio;
    private MethodPay methodPay;
    private Long amount;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public MethodPay getMethodPay() {
        return methodPay;
    }

    public void setMethodPay(MethodPay methodPay) {
        this.methodPay = methodPay;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("fio='").append(fio).append('\'');
        sb.append(", methodPay=").append(methodPay.getDescRus());
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}

