package homework721;

import static homework721.utils.SalaryUtils.isNotWorkerByWork;

public class Main {
    public static void main(String[] args) {
       Worker workerHour = new HourWorker(100);
       workerHour.setFio("Иванов");
       workerHour.setMethodPay(MethodPay.HOUR);
       workerHour.setAmount(100L);

       if (isNotWorkerByWork(workerHour)) {

       }

        System.out.println(workerHour);
        }
    }

