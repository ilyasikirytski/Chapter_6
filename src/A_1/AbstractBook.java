package A_1;

abstract class AbstractBook implements Edition {
    private int numberOfEdition = 0;
    private int countOfLists = 100;

    public int getNumberOfEdition() {
        if (numberOfEdition > numberOfEdition - 1) {
            numberOfEdition += 1;
        }
        return numberOfEdition;
    }

    public int getCountOfLists() {
        return countOfLists;
    }
}
