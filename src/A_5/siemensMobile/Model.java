package A_5.siemensMobile;

// TODO - опять же возможно модель должна быть абстрактной в классе SiemensMobile или даже Mobile?
//  немног оне понятно цель использования, если сможешь обяснить то можешь не править) может я просто тупанул)))
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
