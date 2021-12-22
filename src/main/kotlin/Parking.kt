data class Parking(val vehiclesIn: MutableSet<Vehicle>){

    var checkoutPair: Pair<Int, Int> = Pair(0,0)

    val maxParking = 20
    var vehicles = vehiclesIn

    fun addVehicle(vehicle: Vehicle): Boolean{
        if(vehicles.count() < maxParking){
            vehicles.add(vehicle)
            return true
        }
        else{
            return false
        }
    }

    fun listVehicles(){
            println("Lista de autos en el estacionamiento")
        vehicles.forEach{
            println(it.plate)
        }
    }

    fun vehiclesAndProfits(){


        //val parkinSpace = ParkingSpace()


    }




}
