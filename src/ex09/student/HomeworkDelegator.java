package ex09.student;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDelegator {

    private final List<Student> studentList = new ArrayList<>();

    // 작업을 위임하기 위해 미리 정의된 학생 객체들을 리스트에 추가
    public HomeworkDelegator(){
        studentList.add(new MathStudent());
        studentList.add(new ScienceStudent());
    }

    public void delegateHomework(HomeworkType homeworkType){
        studentList.stream()
                .filter(student -> {
                    return student.isSameHomework(homeworkType);
                })
                .forEach(student -> {
                    student.doHomework();
                });
    }
}
