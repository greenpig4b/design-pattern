package ex09;


/*
*  개념 : 객체가 자신이 직접 작업을 수행하지 않고 다른 객체에게 위임
*  다른객체에게 대신 일을 맡긴다.
*
*
*  목표
*  작업을 직접 수행하지않고, 그 작업을 위임한다.
*
*  작업 순서
*  1. 규칙을 정한다. 어떤 매서드를 만들것인지 어떤 결과가 나와야하는지
*  2. 객체를 고른다. -> 학생종류(과학,수학) 등
*  3. 숙제를 시킨다. -> 숙제를 하라고 한다.
*
*  사용 이유
*  효율적이다. -> 내가 원하는 일만하는 객체에게 맡기면 정확하다.
*  유연성
* */


import ex09.student.HomeworkDelegator;
import ex09.student.HomeworkType;

public class App {
    public static void main(String[] args) {
        HomeworkDelegator homeworkDelegator = new HomeworkDelegator();

        // 1. 수학
        homeworkDelegator.delegateHomework(HomeworkType.MATH);

        // 2. 과학
        homeworkDelegator.delegateHomework(HomeworkType.SCIENCE);

        // 3. 역사
        homeworkDelegator.delegateHomework(HomeworkType.HISTORY);
    }
}
