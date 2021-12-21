import java.util.*

fun main(args: Array<String>) {
    // 1-  Utilizamos los Set ya que este tipo de estructura no permite elementos duplicados
    val parking = Parking(mutableSetOf())
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTORCICLE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car1 = Vehicle("AA112AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car2 = Vehicle("AA113AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
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
    val car17 = Vehicle("AA128AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car18 = Vehicle("AA129AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")

    val inputCars = listOf<Vehicle>(car,car1,car2,car3,car4,car5,car6,car7,car8,car9,car10,car11,car12,car13,car14,car15,car16,car16,car17,car18,moto,bus, minibus)

    inputCars.forEach{
        it -> if(parking.addVehicle(it)){
            println("Welcome to AlkeParking")
    }else{
            println("Sorry, the check-in failed!")
    }
    }

    parking.listVehicles()

    val parkingSpace = ParkingSpace(car,parking)
    val result = parkingSpace.checkOutVehicle(car.plate)
    println(result)


    /*parking.addVehicle(car1)
    parking.addVehicle(car2)
    parking.addVehicle(car3)
    parking.addVehicle(car4)
    parking.addVehicle(car5)
    parking.addVehicle(car6)
    parking.addVehicle(car7)
    parking.addVehicle(car8)
    parking.addVehicle(car9)
    parking.addVehicle(car10)
    parking.addVehicle(car11)
    parking.addVehicle(car12)
    parking.addVehicle(car13)
    parking.addVehicle(car14)
    parking.addVehicle(car15)
    parking.addVehicle(car16)
    parking.addVehicle(car17)



    println(parking.addVehicle(car))
    println(parking.addVehicle(moto))
    println(parking.addVehicle(minibus))
    println(parking.addVehicle(bus))

    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))


    val car2 = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_003")
    val isCar2Inserted = parking.vehicles.add(car2)
    println(isCar2Inserted)

    parking.vehicles.remove(moto)
    println(parking.vehicles.contains(moto))*/
}