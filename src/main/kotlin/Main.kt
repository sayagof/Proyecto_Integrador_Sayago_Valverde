import java.util.*

fun main(args: Array<String>) {
    // 1-  Utilizamos los Set ya que este tipo de estructura no permite elementos duplicados

    val car = Vehicle("AAA111", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("AAA222", VehicleType.MOTORCICLE, Calendar.getInstance())
    val minibus = Vehicle("AAA3333", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("BBB111", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val parking = Parking(mutableSetOf(car, moto, bus, minibus))


    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))
}