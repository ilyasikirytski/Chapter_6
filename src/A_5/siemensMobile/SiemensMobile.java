package A_5.siemensMobile;

import A_5.Mobile;

// TODO - название пакета
//  - почему бренд в абстракции захардкожен? то есть я не могу его изменить? почему он не абстрактный?
//  если он для siemens, то почему он не в Mobile как абстрактый а тут не переопределен просто?
abstract class SiemensMobile implements Mobile {
    private String brand = "Siemens";

    protected String getBrand() {
        return brand;
    }
}
