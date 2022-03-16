package A_4;

abstract class PublicBuilding implements Building {
    private String typeOfBuilding;
    private int countOfFlore;
    private int square;

    public PublicBuilding() {
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    @Override
    public void setCountOfFlore(int countOfFlore) {
        this.countOfFlore = countOfFlore;
    }

    @Override
    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "PublicBuilding{" +
                "typeOfBuilding='" + typeOfBuilding + '\'' +
                ", countOfFlore=" + countOfFlore +
                ", square=" + square +
                '}';
    }
}
