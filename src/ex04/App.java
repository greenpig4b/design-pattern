package ex04;
// 전략패턴

/**
 * Pooling (객체를 10개 유지하는 기ㅂ)
 * **/

public class App {
    public static void main(String[] args) {
       Animal mouse = new Mouse();
       Animal tiger = new Tiger();
       DoorMan doorMan = DoorMan.instance;

       doorMan.쫒아내(tiger);
    }
}
