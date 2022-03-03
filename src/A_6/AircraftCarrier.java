package A_6;

public class AircraftCarrier extends AbstractShip {
    public AircraftCarrier(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public void swim() {
        System.out.println("Авианосец плывёт и ведёт наблюдение со скоростью: " + getMaxSpeed());
    }
}
