/*
Kotlin does not have the concept of 'static'
This means you can't put a variable/property or function inside a class and mark it static
You also can't put a 'const val' inside a class
You can only add class members like properties/functions, and these belong to an instance of that class
 */

class Person {

    private var name: String? = null

    fun greet(): String {
        return "Hi, my name is $name"
    }

//    const val SPECIES = "Human" -> ERROR
    /*
    Const 'val' are only allowed on top level, in named objects, or in companion objects
    There is no 'static' or the ability to declare a 'const val' in a class in Kotlin
    Every member of a class in Kotlin belongs only to an instance of that class, a new object

    You can't do Person.SPECIES this way, you can only do...
    val person = Person()
    person.name
     */

}

/*
3 main options for where to put constants in Kotlin:

Top Level - You can write a variable, a constant, or a function outside of class
It can be in the same file as a class, but outside of the class curly braces
It can also be in an empty file with no class
That file just needs to be inside a package

Named Object - You can declare something called an 'object', with a name, and put constants and functions inside that
This allows you to gather up common constants together
In this instance, the term 'object' means there will only ever be a single instance
This is very similar to the idea of 'static' in Java
You cannot make any new instances of this object
It's just a single instance with all the constants/functions inside it available at all times

Companion Object - If you have a class and want some constants with it, you can add a 'companion object'
This allows you to have a constant within your class 'namespace'
This is also highly similar to the idea of 'static' in Java
 */

/*
Named Object
We declare a single object with the word 'object' rather than 'class', followed by its name
The word object here means there will only ever be a single instance of the object
This is a very close equivalent to the idea of 'static'
 */
object CountryCodes {

    const val UNITED_STATES = "US"
    const val INDIA = "IN"
    const val UNITED_KINGDOM = "GB"
    const val GERMANY = "DE"
    const val CANADA = "CA"
    const val POLAND = "PL"
    const val BRAZIL = "BR"
    const val SOUTH_AFRICA = "ZA"
    const val INDONESIA = "ID"
    const val TURKEY = "TR"

    fun getFullName(code: String): String {
        return when (code) {
            UNITED_STATES -> "United States of America"
            UNITED_KINGDOM -> "United Kingdom"
            // the other countries etc.
            else -> "Unknown country"
        }
    }

    // You can nest objects
    object ThreeLetter {
        const val UNITED_STATES = "USA"
        const val INDIA = "IND"
        const val UNITED_KINGDOM = "GBR"
    }

}

// You access properties, or functions, within an object with just the name of the object, and the property/function
CountryCodes.UNITED_KINGDOM
CountryCodes.UNITED_STATES
CountryCodes.ThreeLetter.UNITED_STATES
CountryCodes.getFullName("GB")

/*
Companion Object
The way to put constants inside a class namespace, also very similar to static in Java
The decompiled Java code will convert this into static properties/methods of the containing class
 */
class Employee(val name: String, val grade: String) {

    fun printDetails() {
        println("Name: $name")
        println("Grade: $grade")
        // We can even use the constant here
        println("Company: $COMPANY_NAME")
    }

    companion object {

        const val COMPANY_NAME = "Barney Corporation"

        fun isAdmin(employee: Employee): Boolean {
            return employee.grade == "Manager"
        }

    }

}

Employee.COMPANY_NAME

val employeeReg = Employee("Reg", "Manager")
val employeeAlexandra = Employee("Alexandra", "Secretary")

employeeReg.printDetails()
employeeAlexandra.printDetails()

Employee.isAdmin(employeeReg)
Employee.isAdmin(employeeAlexandra)

employeeReg.name