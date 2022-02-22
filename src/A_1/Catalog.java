package A_1;

// TODO у тебя методы print в Catalog и Encyclopedia отличаются одним словом "Каталог", может стоило просто сделать
//  поле вроде "тип книги"/"навание" и переопределить его, а реализацию метода принт оставить в AbstractBook
public class Catalog extends AbstractBook {

    @Override
    public void print() {
        System.out.println("Каталог - издание " + getNumberOfEdition() + " размером " + getCountOfLists() + " листов - издано!");
    }

}
