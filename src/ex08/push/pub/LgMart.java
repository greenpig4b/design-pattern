package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LgMart implements Mart{

    private List<Customer> customerList = new ArrayList<>(); // 구독자 명단

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void recieved() {
        for (int i = 0; i < 15; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // .....

        }
        notify("LgMart : 딸기");
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
