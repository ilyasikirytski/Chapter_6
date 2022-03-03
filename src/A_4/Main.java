/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
4. interface Здание <- abstract class Общественное Здание <- class Театр
 */
package A_4;

public class Main {
    public static void main(String[] args) {
        BuilderCompany builderCompany = new BuilderCompany();
        builderCompany.build(new Theater(), 2, 100);
        builderCompany.build(new Cinema(), 3, 50);
    }
}
