/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
3. interface Сотрудник <- class Инженер <- class Руководитель.
 */
package A_3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.work();
        Engineer engineer = new Engineer();
        engineer.work();
    }
}
