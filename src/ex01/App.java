package ex01;
// 전략패턴

public class App {
    public static void main(String[] args) {
       Animal mouse = new Mouse();
       Animal tiger = new Tiger();
       DoorMan doorMan = new DoorMan();

       doorMan.쫒아내(tiger);
    }
}
