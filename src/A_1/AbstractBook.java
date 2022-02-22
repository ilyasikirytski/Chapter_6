package A_1;

// TODO а вот поля как номер издания как раз бы подошло для того чтобы положить его в издании.
//  а получается книга мало того что сама себя печатает, так еще и номер издания сама себе подбирает? типо у нее
//  есть выход в интернет и она туда ходит чтобы номер издания получить?)
abstract class AbstractBook implements Edition {
    private int numberOfEdition = 0;

    // TODO и все книги только строго по 100 страниц? 50 не сделать никак, запрещено законом?)
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
