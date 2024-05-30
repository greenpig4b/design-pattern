package ex09.student;

public class HistoryStudent implements Student{
    @Override
    public void doHomework() {
        System.out.println("역사수업중입니다.");
    }

    @Override
    public boolean isSameHomework(HomeworkType homeworkType) {
        return HomeworkType.HISTORY.equals(homeworkType);
    }
}
