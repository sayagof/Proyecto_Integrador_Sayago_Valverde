import java.util.*
import java.util.Calendar.*

const val MINUTES_IN_MILISECONDS = 60000
data class Vehicle(val plate: String, val type : VehicleType,val checkInTimeParking : Calendar, val discountC : String? = null){
    val vehiclePlate = plate
    val vehicleType =  type
    val discountCard = discountC?.let { discountC } ?: run{ null }
    val checkInTime  = Calendar.getInstance()
    val parkedTime : Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis)/ MINUTES_IN_MILISECONDS


    //Function states that two vehicles are equals if their plates are equal
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }

    //Function states that the hashCode (Used internally in search functions
    //in sets and arrays) is the hasCode of the plate
    override fun hashCode(): Int = this.plate.hashCode()
}
