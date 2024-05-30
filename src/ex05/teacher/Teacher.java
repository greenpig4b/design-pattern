package ex05.teacher;

abstract public class Teacher {

    public void 수업하기(){
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

    private void 입장하기(){
        System.out.println("입장하기");
    }

    private void 출석부르기(){
        System.out.println("출석부르기");
    }

    abstract public void 강의하기(); //구체적인 구현이 되지않는다면 추상화를 해야한다.

    private void 퇴장하기(){
        System.out.println("퇴장하기");
    }
}
