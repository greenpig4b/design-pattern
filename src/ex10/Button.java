package ex10;

enum ButtonEnum { LAMP, ALARM };

public class Button {
    // 1. 첫번째 문제점 : 새로운 기능으로 변경하려고 기존 코드(Button 클래스)의 내용을 수정해야 하므로 OCP에 위배된다.
    // 2. 두번째 문제점 : 버튼을 누르는 동작에 따라 다른 기능을 실행하는 경우

    private Lamp lamp;
    private Alarm alarm;
    private ButtonEnum themode;

    // 생성자
    public Button(Lamp lamp){
        this.lamp = lamp;
    }

    // 생성자
    public Button(Alarm alarm){

        this.alarm = alarm;
    }

    // 생성자
    public Button(Lamp lamp, Alarm alarm){
        this.alarm = alarm;
        this.lamp = lamp;
    }

    // 모드 설정
    public void setMode(ButtonEnum mode){
        this.themode = mode;

        switch(themode){
            case LAMP :
                if (lamp != null){
                    lamp.turnOn();
                    break;
                }else {
                    System.out.println("램프를 설정해주세요!");
                }

            case ALARM :
                if (alarm != null){
                    alarm.start();
                    break;
                }else{
                    System.out.println("알람을 설정해주세요!");
                }

        }

    }



}
