package A_2.partTimeStudents;

import A_2.Applicant;

// TODO плохое название пакетов, при наименовании пакетов используют только нижний регистр, а если нужно
//  несколько слов - в крайнем случае нижнее подчеркивание, или лучше несколько пакетов если по смыслу подходит,
//  в данном случае ты вообще затащил конкретную реализацию в название пакета, стоило просто назвать "student" например
abstract class AbstractStudent implements Applicant {
    private String studentName;
    private int countOfPassedExams;

    protected String getStudentName() {
        return studentName;
    }

    void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    protected int getCountOfPassedExams() {
        return countOfPassedExams;
    }

    protected void passExam() {
        if (countOfPassedExams > countOfPassedExams - 1) {
            countOfPassedExams += 1;
        }
    }
}
