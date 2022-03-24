package A_5;

public class SamsungMobile extends Model implements Mobile {
    private String brand = "Samsung";

    public SamsungMobile(String modelName) {
        super(modelName);
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
