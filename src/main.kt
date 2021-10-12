fun main() {
    var emp1 = Employee("Justin", PositionTitle.ADMINISTRATION, false, 15.00, 2)
    var emp2 = Employee("james", PositionTitle.ADMINISTRATION, true, 15.00, 2)
    var emp3 = Employee("jason", PositionTitle.PRODUCTION, false, 20.50, 3)

    emp1.hoursIn(50.00)
    emp2.hoursIn(25.00)
    emp3.hoursIn(60.00)
}

//notes
//    var person1 = Person("Justin", "McMahon", 'C', 38)
//    println(person1.fullName)
//    person1.firstName = "Mike"
//    person1.lastName = "Mike"
//    person1.middleInitial = 'M'
//    println("${person1.firstName} --- ${person1.fullName}")
//    println(Compass.NORTH)
//    println("${goDirection(Compass.SOUTH)}")
//    println("${Compass.WEST.displayIt()}")
//    println("${Compass.NORTH.shortName}")

    //notes
//fun goDirection(dir:Compass): String{
//    when (dir) {
//        Compass.NORTH -> return "North"
//        Compass.SOUTH -> return "South"
//        Compass.EAST -> return "East"
//        Compass.WEST -> return "West"
//        else -> return "Go Nowhere"
//    }
//}