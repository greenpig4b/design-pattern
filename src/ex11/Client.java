package ex11;

import ex11.Command.AlarmEndCommand;
import ex11.Command.AlarmStratCommand;
import ex11.Command.Command;
import ex11.Command.LampOnCommand;

// 호출자
public class Client {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alramStartCommand = new AlarmStratCommand(alarm);
        Command alramStopCommand = new AlarmEndCommand(alarm);

        // 램프 켜는 Command 설정
        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        // 알람 울리는 Command 설정
        Button button2 = new Button(alramStartCommand);
        button2.pressed();

        // 다시 램프켜는 Command로 설정
        button2.setCommand(lampOnCommand);
        button2.pressed();

        Button button3 = new Button(lampOnCommand);
        button3.pressed();

        button3.setCommand(alramStopCommand);
        button3.pressed();
    }


}
