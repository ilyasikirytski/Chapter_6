/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
3. interface Сотрудник <- class Инженер <- class Руководитель.
 */
package A_3;

public class Main {
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer();
        engineer1.setName("инженер1");
        Engineer engineer2 = new Engineer();
        engineer2.setName("инженер2");

        Director director = new Director();
        director.addEngineer(engineer1, engineer2);
        director.work();
    }
}
