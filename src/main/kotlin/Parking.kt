data class Parking(val vehicles: MutableSet<Vehicle>){
    val maxParking = 20

    fun addVehicle(vehicle: Vehicle): Boolean{
        if(vehicles.count() < maxParking){
            vehicles.add(vehicle)
            return true
        }
        else{
            return false
        }
    }


}
