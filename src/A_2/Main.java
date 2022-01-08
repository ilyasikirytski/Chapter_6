/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
2. interface Абитуриент <- abstract class Студент <- class Студент-Заочник
interface Applicant <- abstract class Student <- class Part-time Student
 */
package A_2;

import A_2.partTimeStudents.PartTimeStudent;

public class Main {
    public static void main(String[] args) {
        PartTimeStudent partTimeStudent = new PartTimeStudent();
        partTimeStudent.studentName("Jack");
        partTimeStudent.printStatistic();
        partTimeStudent.passExams();
        partTimeStudent.passExams();
        partTimeStudent.passExams();
        partTimeStudent.printStatistic();
        partTimeStudent.passExams();
        partTimeStudent.passExams();
        partTimeStudent.printStatistic();
    }
}
