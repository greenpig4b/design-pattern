package ex02;

public class DoormanProxy2 {

    private final Doorman doorman;


    public DoormanProxy2(Doorman doorman) {
        this.doorman = doorman;
    }


    public void 쫒아내(Animal animal){
        System.out.println("지갑 검사");
        doorman.쫒아내(animal);

    }
}
