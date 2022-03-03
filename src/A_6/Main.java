/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
6. interface Корабль <- abstract class Военный Корабль <- class Авианосец.
 */
package A_6;

public class Main {
    public static void main(String[] args) {
        AircraftCarrier aircraftCarrier = new AircraftCarrier(50);
        aircraftCarrier.swim();
        DryCargoShip dryCargoShip = new DryCargoShip(20);
        dryCargoShip.swim();
    }
}
