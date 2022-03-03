package Kot_B_6

abstract class KotAbstractShip(private var maxSpeed: Int) : KotShip {

    open fun getMaxSpeed(): Int {
        return maxSpeed
    }
}