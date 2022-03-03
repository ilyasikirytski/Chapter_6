/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
5. interface Mobile <- abstract class Siemens Mobile <- class Model.
 */
package A_5;

import A_5.siemens.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model("c55");
        model.ring();
    }
}
