package A_5.siemens;

import A_5.Mobile;

// TOD - название пакета
//  - почему бренд в абстракции захардкожен? то есть я не могу его изменить? почему он не абстрактный?
//  если он для siemens, то почему он не в Mobile как абстрактый а тут не переопределен просто?

// ОТВЕТ - Я думал, что если компания делает телефоны под брендом "Siemens", то и бренд на всех телефонах будет один.
// Ты же не можешь поменять название бренда на своём телеофне...
abstract class SiemensMobile implements Mobile {
    private String brand = "Siemens";

    protected String getBrand() {
        return brand;
    }
}
