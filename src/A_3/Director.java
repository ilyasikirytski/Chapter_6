package A_3;

// TOD? как я понял из задания interface Сотрудник <- class Инженер <- class Руководитель.
//  то руководитель тоже должен быть инженером, а у тебя он просто работник
public class Director extends Engineer {
    private final Engineer engineer = new Engineer();
    @Override
    public void work() {
        System.out.println("Директор заставил инженера работать");
        engineer.work();
    }
}
