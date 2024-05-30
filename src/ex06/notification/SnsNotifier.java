package ex06.notification;

public class SnsNotifier implements Notifier{
    private Notifier notifier;

    public SnsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public SnsNotifier() {}

    //재정의
    public void send(){
        if (notifier != null) notifier.send();
        System.out.println("문자 알림");
    }
}
