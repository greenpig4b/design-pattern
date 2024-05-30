package ex11.Command;

// 램프를 켜는 LampOnCommand 클래스

import ex11.Lamp;

public class LampOnCommand implements Command {

    private Lamp lamp;

    //생성자
    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    //재정의
    public void execute() {
        lamp.turnOn();
    }


}