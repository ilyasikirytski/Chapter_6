package Kot_B_6

class KotAircraftCarrier(maxSpeed : Int) : KotAbstractShip(maxSpeed) {
    override fun swim() {
        println("KOT - Авианосец плывёти ведёт наблюдение со скоростью: ${getMaxSpeed()}" )
    }
}