package ex11.Command;

import ex11.Alarm;

// 알람을 울리는 AlarmStartCommand 클래스
//ConcreteCommand
public class AlarmStratCommand implements Command {

    private Alarm alarm;

    //생성자
    public AlarmStratCommand(Alarm alarm){
        this.alarm = alarm;
    }

    //재정의
    public void execute() {
        alarm.start();
    }

}