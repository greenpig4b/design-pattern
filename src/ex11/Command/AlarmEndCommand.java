package ex11.Command;

import ex11.Alarm;

public class AlarmEndCommand implements Command {

    private Alarm alarm;

    //생성자
    public AlarmEndCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.end();
    }
}
