package ex00;

/*
 * 목표 : heap, stack, static 구분하기
 *
 * 1. JVM(자바 가상머신)는 static 키워드가 붙은 친구들을 static 메모리에 로드한다.
 * 2. JVM은 static 메모리에서 main 매서드를 찾아서 실행한다.
 * 3. JVM의 생명주기는 main 매서드의 코드 줄 (Queue)
 * 4. 매서드 실행 시에 stack이 열린다.
 * 5. heap은 new 할떄 생성
 * 6. stack 매서드 호출시 생성
 * 7. static 메인호출전 부터 생성
 * */

class Animal{

    String name = "강아지";

    void speak(){ // speak 매서드 스택 생성
        String sound = "멍멍";
        System.out.println(sound);
    } //speak 매서드 스택 소멸
}


public class Mem01 {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
        System.out.println(a.name);
    }
}
