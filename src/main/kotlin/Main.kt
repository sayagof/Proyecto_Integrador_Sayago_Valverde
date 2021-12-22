import java.util.*

fun main(args: Array<String>) {
    // 1-  Utilizamos los Set ya que este tipo de estructura no permite elementos duplicados
    val parking = Parking(mutableSetOf())
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car1 = Vehicle("AA112AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car2 = Vehicle("AA113AA", VehicleType.CAR, Calendar.getInstance())
    val car3 = Vehicle("AA114AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car4 = Vehicle("AA115AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car5 = Vehicle("AA116AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car6 = Vehicle("AA117AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car7 = Vehicle("AA118AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car8 = Vehicle("AA119AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car9 = Vehicle("AA120AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car10 = Vehicle("AA121AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car11= Vehicle("AA122AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car12 = Vehicle("AA123AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car13 = Vehicle("AA124AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car14 = Vehicle("AA125AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car15 = Vehicle("AA1126AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car16 = Vehicle("AA1127A", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")


    val inputCars = listOf<Vehicle>(car,moto,minibus,bus,car1,car2,car3,car4,car5,car6,car7,car8,car9,car10,car11,car12,car13,car14,car15,car16,car16/*,car17,car18*/)

    inputCars.forEach{
        it -> if(parking.addVehicle(it)){
            println("Welcome to AlkeParking")
    }else{
            println("Sorry, the check-in failed!")
    }
    }

    println()
    println("---------------------------------")
    val parkingSpace = ParkingSpace(car,parking)
    parkingSpace.checkOutVehicle(car2.plate) // without discount
    parkingSpace.checkOutVehicle(car3.plate)
    parkingSpace.checkOutVehicle(car4.plate)
    parkingSpace.checkOutVehicle(moto.plate)
    parkingSpace.checkOutVehicle(minibus.plate)
    parkingSpace.resumeFee()

    println()
    println("---------------------------------")
    parking.listVehicles()

}