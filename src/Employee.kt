class Employee(
    name: String,
    position: PositionTitle,
    salary: Boolean,
    payRate: Double,
    shift: Int
        ){
    var name: String = name
        get() = field
        set(value) {
            field = value
        }
    var position: PositionTitle = position
        get() = field
        set(value) {
            field = field
        }
    var salary: Boolean = salary
        get() = field
        set(value) {
            field = value
        }
    var payRate: Double = payRate
        get() = field
        set(value) {
            field = value
        }
    var shift: Int = shift
        get() = field
        set(value) {
            field = value
        }
    fun hoursIn(hours: Double) {
        var pay : Double = payRate
        if (!salary){
            when (shift) {
                1 -> pay = (hours * payRate)
                2 -> pay = (hours * (payRate +(payRate * 0.05)))
                3-> pay = (hours * (payRate +(payRate * 0.1)))
            }
            if (hours > 40) {
                val overtime = hours - 40
                pay += (overtime * (payRate * 1.5))
            }
        }
        println("Name: $name\n" +
                "Position: $position\n" +
                "Pay Rate: $payRate\n" +
                "Hours: $hours\n" +
                "Pay owed this week: $pay\n" +
                "**************************")
    }

}

enum class PositionTitle {
    ADMINISTRATION, PRODUCTION, SALES, MAINTENANCE, TECHNICAL, SECRETARIAL
}
