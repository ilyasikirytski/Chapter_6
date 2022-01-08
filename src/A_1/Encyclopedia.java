package A_1;

public class Encyclopedia extends AbstractBook {

    @Override
    public void print() {
        System.out.println("Энциклопедия: издание " + getNumberOfEdition() + "; размером " + getCountOfLists() + " листов - издано!");
    }

}
