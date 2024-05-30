package ex02;
// 전략패턴

public class App {
    public static void main(String[] args) {
       Animal mouse = new Mouse();
       Animal tiger = new Tiger();
       DoormanProxy2 doorMan = new DoormanProxy2(new Doorman());

       doorMan.쫒아내(mouse);
    }
}
