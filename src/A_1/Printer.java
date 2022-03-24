package A_1;

public class Printer {
    public void print(AbstractBook typeOfEdition) {
        System.out.println(typeOfEdition.getTypeOfEdition() + " - издание " + typeOfEdition.getNumberOfEdition() + " размером " + typeOfEdition.getCountOfLists() + " листов - издано!");
    }
}
