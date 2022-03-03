/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
1. interface Издание <- abstract class Книга <- class Справочник и Энциклопедия
 */
package A_1;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.setNumberOfEdition(1);
        catalog.print();
        catalog.print();
        catalog.setCountOfLists(150);
        catalog.setNumberOfEdition(2);
        catalog.print();

        Encyclopedia encyclopedia = new Encyclopedia();
        encyclopedia.setNumberOfEdition(1);
        encyclopedia.print();
        encyclopedia.print();
        encyclopedia.setCountOfLists(250);
        encyclopedia.setNumberOfEdition(2);
        encyclopedia.print();
    }
}
