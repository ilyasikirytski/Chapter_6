/*
Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей:
6. interface Корабль <- abstract class Военный Корабль <- class Авианосец.
 */
package A_6;

public class Main {
    public static void main(String[] args) {
        AircraftCarrier aircraftCarrier = new AircraftCarrier();
        aircraftCarrier.swim();
        DryCargoShip dryCargoShip = new DryCargoShip();
        dryCargoShip.swim();
    }
}
