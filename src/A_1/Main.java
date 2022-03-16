/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
1. interface Издание <- abstract class Книга <- class Справочник и Энциклопедия
 */
package A_1;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Printer printer = new Printer();

        catalog.setNumberOfEdition(1);
        printer.print(catalog);
        printer.print(catalog);
        catalog.setCountOfLists(150);
        catalog.setNumberOfEdition(2);
        printer.print(catalog);

        Encyclopedia encyclopedia = new Encyclopedia();
        encyclopedia.setNumberOfEdition(1);
        printer.print(encyclopedia);
        printer.print(encyclopedia);
        encyclopedia.setCountOfLists(250);
        encyclopedia.setNumberOfEdition(2);
        printer.print(encyclopedia);
    }
}
