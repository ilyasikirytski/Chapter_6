package A_2.partTimeStudents;

public class PartTimeStudent extends AbstractStudent {

    public void studentName(String studentName) {
        setStudentName(studentName);
    }

    public void passExams() {
        passExam();
        System.out.println("Экзамен сдан!");
    }

    @Override
    public void printStatistic() {
        System.out.println("Студент - " + getStudentName() + "; Колличество сдач - " + getCountOfPassedExams());
    }
}
