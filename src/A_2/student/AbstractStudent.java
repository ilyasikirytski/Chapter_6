package A_2.student;

import A_2.Applicant;

abstract class AbstractStudent implements Applicant {
    private String studentName;
    private int countOfPassedExams;
    private String typeOfStudy;

    protected String getStudentName() {
        return studentName;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    protected int getCountOfPassedExams() {
        return countOfPassedExams;
    }

    public void passExams() {
        countOfPassedExams += 1;
        printResultOfExam();
    }

    protected void printResultOfExam() {
        System.out.println("Экзамен сдан!");
    }

    @Override
    public void printStatistic() {
        System.out.println("Студент - " + getStudentName() +"Тип обучения: " + getTypeOfStudy() + "; Колличество сдач - " + getCountOfPassedExams());
    }
}
