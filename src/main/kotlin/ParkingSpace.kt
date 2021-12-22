import kotlin.math.round

data class ParkingSpace(var vehicle: Vehicle, val parkingInput : Parking) {
    var parking = parkingInput

    fun checkOutVehicle(plate: String): Int {
        var totalFee : Int = 0

         if (vehicle.plate == plate) {
                totalFee = onSuccess(vehicle)
                println("Your fee is $$totalFee Come back soon.")

            } else {
                totalFee = onError()
                println("Sorry, the check-out failed")

            }

        return totalFee
    }

    private fun onError():Int {
        return 0
    }

    private fun onSuccess(vehicle: Vehicle) : Int {
        val finalFee = calculateFee(vehicle)

        parking.vehicles.remove(vehicle)

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
}
