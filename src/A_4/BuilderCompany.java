package A_4;

public class BuilderCompany {
    public BuilderCompany() {
    }

    public void build(PublicBuilding publicBuilding, int countOfFlore, int square) {
        publicBuilding.setCountOfFlore(countOfFlore);
        publicBuilding.setSquare(square);
        System.out.println(publicBuilding);
    }
}
