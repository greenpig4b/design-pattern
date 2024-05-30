package ex08.push.pub;

import ex08.push.sub.Customer;

/*
* 1. 구독한 손님의 정보가 필요함
* */

public interface Mart {

    //1. 구독
    void add(Customer customer); // 손님을 등록해야하는 매서드

    //2. 출판 = (축구 동영상 업로드)
    void recieved();

    //3. 알림(구독자에게 알림)
    void notify(String message); // 알림가는 매서드

    //4. 구독취소
    void remove(Customer customer);

}
