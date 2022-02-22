package A_3;

// TODO как я понял из задания interface Сотрудник <- class Инженер <- class Руководитель.
//  то руководитель тоже должен быть инженером, а у тебя он просто работник
public class Director implements Employee {
    @Override
    public void work() {
        System.out.println("Директор работает");
    }
}
