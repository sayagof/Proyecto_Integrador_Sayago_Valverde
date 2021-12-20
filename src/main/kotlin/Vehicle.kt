data class Vehicle(val plate: String, val type : VehicleType){
    val vehiclePlate = plate
    val vehicleType =  type
    val discountCoupon = false
    



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
