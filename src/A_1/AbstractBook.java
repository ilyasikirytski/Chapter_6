package A_1;

// TOD?? а вот поля как номер издания как раз бы подошло для того чтобы положить его в издании.
//  а получается книга мало того что сама себя печатает, так еще и номер издания сама себе подбирает? типо у нее
//  есть выход в интернет и она туда ходит чтобы номер издания получить?)
abstract class AbstractBook implements Edition {
    private String typeOfBook;
    private int numberOfEdition = 0;
    private int countOfLists = 100;

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
