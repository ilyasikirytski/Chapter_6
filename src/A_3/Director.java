package A_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Director extends Engineer {
    private final ArrayList<Engineer> engineers = new ArrayList<>();

    public void addEngineer(Engineer... engineer) {
        engineers.addAll(Arrays.asList(engineer));
    }

    @Override
    public void work() {
        for (Engineer engineer : engineers) {
            System.out.printf("Директор заставил работать: %s\n", engineer.getName());
            engineer.work();
        }
    }
}
