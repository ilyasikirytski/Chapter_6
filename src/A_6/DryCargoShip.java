package A_6;

public class DryCargoShip extends AbstractShip {
    public DryCargoShip(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public void swim() {
        System.out.println("Сухогруз перевозит контейнеры со скоростью: " + getMaxSpeed());
    }
}
