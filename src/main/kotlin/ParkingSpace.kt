import kotlin.math.round

data class ParkingSpace(var vehicle: Vehicle, val parkingInput : Parking) {

    var parking = parkingInput.vehicles

    var checkoutPair: Pair<Int, Int> = Pair(0,0)

    fun checkOutVehicle(plate: String) {
        var totalFee : Int = 0

        parking.filter { it.plate == plate }.forEach{
            if (it.plate == plate) {
                totalFee = onSuccess(it)
                vehiclesAndProfits(totalFee)

                println("Your fee is $$totalFee Come back soon.")

            } else {
                totalFee = onError()
                println("Sorry, the check-out failed")

            }
        }



        //parking.vehiclesAndProfits(totalFee)
    }

    private fun onError():Int {
        return 0
    }

    private fun onSuccess(vehicle: Vehicle) : Int {
        val finalFee = calculateFee(vehicle)

        parking.remove(vehicle)

        return finalFee
    }

    private fun calculateFee(vehicle: Vehicle): Int {
        val TWO_HOURS = 120
        val excededTime = if(vehicle.parkedTime.toInt() - TWO_HOURS>0) vehicle.parkedTime.toInt() - TWO_HOURS else 0
        var excededTimeRound = round(excededTime.toDouble()/15)


        val hasDiscountCard: Boolean = vehicle.discountCard?.let {
            true
        } ?:run {
            false
        }

            var result = when(vehicle.type){
                VehicleType.CAR -> (VehicleType.CAR.pricing + excededTimeRound * 5).toInt()
                VehicleType.MOTORCYCLE -> (VehicleType.MOTORCYCLE.pricing + excededTimeRound *5).toInt()
                VehicleType.BUS -> (VehicleType.BUS.pricing + excededTimeRound *5).toInt()
                VehicleType.MINIBUS -> (VehicleType.MINIBUS.pricing + excededTimeRound *5).toInt()
            }

            if(hasDiscountCard){
                result = (result * 0.85).toInt()
            }

            return result

    }


    fun vehiclesAndProfits(mountFee: Int){

        var countCar = checkoutPair.first + 1
        var totalFeeCar = checkoutPair.second + mountFee
        checkoutPair = Pair(countCar, totalFeeCar)
    }

    fun resumeFee(){
        println("${checkoutPair.first} vehicles have checked out and have earnings of ${checkoutPair.second}")
    }


}
