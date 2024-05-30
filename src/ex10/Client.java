package ex10;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Alarm alarm = new Alarm();
        Button newButton = new Button(lamp,alarm);

        newButton.setMode(ButtonEnum.ALARM);

    }
}
