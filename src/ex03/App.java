package ex03;
// 전략패턴

import ex03.lib.OuterRabbit;
import ex03.lib.Outerdock;

public class App {
    public static void main(String[] args) {
       Animal rabbit = new RabbitAdapter(new OuterRabbit());
       Animal dock = new DockAdapter(new Outerdock());
       DoorMan doorMan = new DoorMan();

       doorMan.쫒아내(dock);

    }
}
