package ex08.push;

import ex08.push.pub.LgMart;
import ex08.push.pub.LotteMart;
import ex08.push.pub.Mart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

public class App {
    public static void main(String[] args) {

        //1. Bean 로드
        Mart lotteMart = new LotteMart();
        Mart lgMart = new LgMart();

        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();

        //2. 구독
        lgMart.add(cus1);
        lgMart.add(cus2);

        lotteMart.add(cus1);
        lotteMart.add(cus2);

        //3. 구독취소
        lotteMart.remove(cus2);

        //4. 출판
        new Thread(() -> {
            lotteMart.recieved();
        }).start();

        new Thread(() -> {
            lgMart.recieved();
        }).start();
    }
}
