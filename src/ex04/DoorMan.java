package ex04;
/**
 * 목적 : 문지기를 메모리에 하나만 올리고 싶다.
 * **/

//문지기
public class DoorMan {

    static DoorMan instance = new DoorMan();

    private DoorMan(){}

    public void 쫒아내(Animal animal){
        System.out.println(animal.getName() + "를 쫒아내");
    }
}
