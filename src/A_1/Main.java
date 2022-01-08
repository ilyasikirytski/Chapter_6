/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
1. interface Издание <- abstract class Книга <- class Справочник и Энциклопедия
 */
package A_1;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.print();
        catalog.print();
        catalog.print();
        Encyclopedia encyclopedia = new Encyclopedia();
        encyclopedia.print();
        encyclopedia.print();
        encyclopedia.print();
        encyclopedia.print();
        encyclopedia.print();
    }
}
