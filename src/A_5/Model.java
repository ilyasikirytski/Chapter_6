package A_5;

abstract class Model implements Mobile{
    private String modelName;

    public Model(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void ring() {
        System.out.println(getBrand() + " " + modelName + " - ring.. ring.. ring..");
    }
}
