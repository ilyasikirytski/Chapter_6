/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
5. interface Mobile <- abstract class Siemens Mobile <- class Model.
 */
package A_5;

public class Main {
    public static void main(String[] args) {
        SiemensMobile siemensMobile = new SiemensMobile("c55");
        siemensMobile.ring();
        SamsungMobile samsungMobile = new SamsungMobile("galaxy s3");
        samsungMobile.ring();
    }
}
