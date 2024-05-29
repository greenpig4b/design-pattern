package ex08.polling;

public class LotteMart {

    private String vlaue = null;

    public String getVlaue() {
        return vlaue;
    }

    public void received(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        vlaue = "상품";
    }
}
