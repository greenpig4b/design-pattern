package ex05;

import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher jt = new PythonTeacher();
        jt.수업하기();
    }
}
