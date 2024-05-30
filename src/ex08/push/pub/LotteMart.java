package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart{

    private List<Customer> customerList = new ArrayList<>(); // 구독자 명단

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void recieved() {
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // .....

        }
        notify("LotteMart : 바나나");
    }

    @Override
    public void notify(String message) {
        customerList.forEach(customer -> {
            customer.update(message);
        });
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }
}
