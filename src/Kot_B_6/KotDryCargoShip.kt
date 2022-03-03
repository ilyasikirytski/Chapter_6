package Kot_B_6

class KotDryCargoShip(maxSpeed: Int) : KotAbstractShip(maxSpeed) {
    override fun swim() {
        println("KOT - Сухогруз перевозит контейнеры со скоростью: ${getMaxSpeed()}" )
    }
}