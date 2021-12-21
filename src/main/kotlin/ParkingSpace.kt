import kotlin.math.round

data class ParkingSpace(var vehicle: Vehicle, val parkingInput : Parking) {
    var parking = parkingInput

    fun checkOutVehicle(plate: String): Int {
        var totalFee : Int = 0
        parking.vehicles.filter { it.plate == plate }.forEach{
            if(it.plate == plate){
                totalFee = onSuccess(it)

        }else{
                totalFee = onError()

            }
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

        /*val hasDiscountCard = vehicle.discountCard?.let {
            true
        } ?:run {
            false
        }
        println(hasDiscountCard)*/

            var result = when(vehicle.type){
                VehicleType.CAR -> (VehicleType.CAR.pricing + excededTimeRound * 5).toInt()
                VehicleType.MOTORCYCLE -> (VehicleType.MOTORCYCLE.pricing + excededTimeRound *5).toInt()
                VehicleType.BUS -> (VehicleType.BUS.pricing + excededTimeRound *5).toInt()
                VehicleType.MINIBUS -> (VehicleType.MINIBUS.pricing + excededTimeRound *5).toInt()
            }
            result = vehicle.discountCard?.let {
                (result * 0.85).toInt()

            } ?: run{
                result
            }
            return result


    }
}
