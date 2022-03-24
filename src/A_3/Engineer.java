package A_3;

public class Engineer implements Employee {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void work() {
        System.out.printf("%s работает\n", name);
    }
}
