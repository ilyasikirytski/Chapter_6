package A_1;

public class Catalog extends AbstractBook {

    @Override
    public void print() {
        System.out.println("Каталог - издание " + getNumberOfEdition() + " размером " + getCountOfLists() + " листов - издано!");
    }

}
