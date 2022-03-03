package A_4;

// TOD не придумал что можно использовать из методов/полей? получается абсолютно бесполезная и пустая абстракция
abstract class PublicBuilding implements Building {
    private String typeOfBuilding;
    private int countOfFlore;
    private int square;

    public PublicBuilding() {
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

    public String getTypeOfBuilding() {
        return typeOfBuilding;
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
