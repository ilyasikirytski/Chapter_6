package A_5;

public class SiemensMobile extends Model implements Mobile {
    private String brand = "Siemens";

    public SiemensMobile(String modelName) {
        super(modelName);
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
