package A_1;

abstract class AbstractBook implements Edition {
    private String typeOfBook;
    private int numberOfEdition = 0;
    private int countOfLists = 100;

    public AbstractBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    public int getCountOfLists() {
        return countOfLists;
    }

    public void setCountOfLists(int countOfLists) {
        this.countOfLists = countOfLists;
    }

    public void setTypeOfBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    @Override
    public String getTypeOfEdition() {
        return typeOfBook;
    }

    @Override
    public int getNumberOfEdition() {
        return numberOfEdition;
    }

    @Override
    public void setNumberOfEdition(int numberOfEdition) {
        this.numberOfEdition = numberOfEdition;
    }
}
