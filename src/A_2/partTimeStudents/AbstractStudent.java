package A_2.partTimeStudents;

import A_2.Applicant;

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
