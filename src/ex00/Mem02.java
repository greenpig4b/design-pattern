package ex00;


/**
 *
 * 목표 : 다향성, 동적바인딩
 * 1. 소나타(오브젝트 == 객체), 재네시스(오브젝트 == 객체)  == 자동차(추상 == NEW x)
 *    추상화를 시키는 이유 : 타입 공통으로 쓰기위해서 ?
 *
 *   Override 문법 1 : 상속 후 new
 *   몸체가 있는 매서드는 재정의를 하지않아도 된다. ex) void hello(){}
 *   abstract 매서드는 몸체가 없기 떄문에 재정의 필요함 ex) abstract void hello(){}
 *
// **/

//부모
abstract class Car{ // new x
    abstract void run(); // 추상매서드를 메모리에 띄울 수 없기 때문에
}

//자식
class Sonata extends Car{
    @Override // 재정의
    void run() {
        System.out.println("소나타 달림");
    } // sonata -> car

}

//자식
class Genesis extends Car{
    @Override // 재정의
    void run() {
        System.out.println("제네시스 달림");
    } // genesis -> car

}

public class Mem02 {

    public static void main(String[] args) {
        Car car1 = new Sonata(); // Sonata 와 Car 같이 뜸 2개
        Car car2 = new Genesis(); // Genesis 와 Car 같이 뜸 2개
        // Car 로 묶일 수는 있지만 Sonata != Genesis 는 다르다.

        car1.run(); // Car(부모) run() 호출하러 갔더니 Sonata(자식이)가 run() 재정의해서 Car{} run() 오버라이드 후 Sonata의 run이 호출된다. == 동적 바인딩 == C# 데이터 바인딩
        car2.run();

    }

}
