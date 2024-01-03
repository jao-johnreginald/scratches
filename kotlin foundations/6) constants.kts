object DemonstratingConstants {

    /*
    Constants - immutable variables that are known at 'Compile Time', cannot be changed, similar to 'val'
    This means they must be set at the start of a program and are fixed for the whole life of the app
     */

    private const val PI = 3.14152623

    fun calculateAreaOfCircle(radius: Double): Double {
        return PI * radius * radius
    }

    fun someFunction() {
//        const val someConstant = "Some value" -> ERROR: Modifier 'const' is not applicable to 'local variable'
        // This function doesn't happen at the start of the program, so you can't use const inside any function
    }

    // Constants are only allowed to be primitive types - String, Int, Double, Boolean

    class Dog
//    const val dog = Dog() -> WON'T WORK. Only primitives and Strings can be a 'constant'

    /*
    Why use constants?
    Using a single constant that you refer to can increase your code clarity, reduce errors, and it's easier to maintain
     */

    // Clarity and readability

    private const val VAT_MULTIPLIER = 1.2

    fun generateTotal(subtotal: Double): Double {
        return subtotal * VAT_MULTIPLIER
    }

    // Magic Numbers - a number that appears in code with no explanation for what it is or what it means

    // Harder to decipher what is going on here with these different numbers
    fun secondsPassed(minutes: Int, hours: Int, days: Int): Int {
        return (minutes * 60) + (hours * 3600) + (days * 86400)
    }

    private const val SECONDS_IN_MINUTE = 60
    private const val SECONDS_IN_HOUR = 3600
    private const val SECONDS_IN_DAY = 86400

    // This is clearer
    fun secondsPassedClearer(minutes: Int, hours: Int, days: Int): Int {
        return (minutes * SECONDS_IN_MINUTE) + (hours * SECONDS_IN_HOUR) + (days * SECONDS_IN_DAY)
    }

    /*
    As a bonus, if you ever need to quickly refer to something complex, like pi, or seconds in day
    then you have a variable ready to call without having to remember the value, or copy and paste it from somewhere
     */

    /*
    Consistency - you may need to refer to the same value over and over in many places, and need it to stay the same
    Rather than typing the hardcoded value over and over, you can make one constant, and just refer to that
    This guarantees the same value always, without the risk of typo
     */

    private const val PLAYER_NAME = "name"
    private const val PLAYER_HEALTH = "health"
    private const val PLAYER_SPECIALTY = "specialty"

    private fun createNewPlayer(name: String, specialty: String): Map<String, Any> {
        return mapOf(
            PLAYER_NAME to name,
            PLAYER_HEALTH to 100,
            PLAYER_SPECIALTY to specialty
        )
    }

    private val stuart = createNewPlayer("Stuart", "deep poke")
    val retrievedName = stuart[PLAYER_NAME]
    val retrievedHealth = stuart[PLAYER_HEALTH]
    val retrievedSpecialty = stuart[PLAYER_SPECIALTY]

    private val po = createNewPlayer("Po", "chi")

    /*
    Maintenance - If the value of a constant needs changing in the app, for whatever reason, we have just one place to update it
    Then everywhere that refers to that constant will receive the change
     */

    // If these values change at any point, they only need amending in one place
    private const val TAX_RATE = 0.19
    private const val INTEREST_FREE_AMOUNT = 13500

    // The rest of the codebase can remain untouched if the tax rate, or interest free amount, changes
    fun calculateIncomeTax(grossSalary: Int): Double {
        return (grossSalary - INTEREST_FREE_AMOUNT) * TAX_RATE
    }

    fun calculateTotalTaxableIncome(grossSalary: Int): Int {
        return grossSalary - INTEREST_FREE_AMOUNT
    }

    fun calculateNetIncome(grossSalary: Int): Double {
        return grossSalary - ((grossSalary - INTEREST_FREE_AMOUNT) * TAX_RATE)
    }

}