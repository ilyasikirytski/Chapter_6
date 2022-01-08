package A_5.siemensMobile;

public class Model extends SiemensMobile {
    private String modelName;

    public Model(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void ring() {
        System.out.println(getBrand() + " " + modelName + " - ring.. ring.. ring..");
    }
}
