package ex08.polling;

/*
* 1. 주기적으로 잘 물어보고
* 2. 실시간으로 반응하려고!!
* 3. 주기를 잘 정해야한다.
* */

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();


        //1. 마트 입고 준비(마트 스레드)
        new Thread(() -> {
            lotteMart.received();
        }).start();

        //2. 손님1 스레드(메인 스레드)
        while (true){
            // polling 설정이 핵심이다.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (lotteMart.getVlaue() != null){
                customer1.update(lotteMart.getVlaue()+"가 들어왔습니다");
                break;
            }else{
                System.out.println("상품이 아직 들어오지 않았습니다.");
            }
            // polling 계속돌리며, 즉각적인 데이더 응답을 받기위해서 시간설정은 프로젝트마다 다 다름
            // 요청이 계속오는걸 flux -> 동영상같은경우가 데이터가 계속 날아오는것
            // yield 프로그램?
        }
    }
}
