class Shop {

    // For class properties, we can do regular variables that we assign immediately
    var isOpen = false

    // We can use 'lateinit', where we are promising to assign it later
    // If we don't, and try to access, the app will crash
    lateinit var manager: String

    // We can use 'lazy initialization' to assign it ONLY WHEN ACCESSED
    // We can put code inside the block, and it will run once the property is first accessed
    // We can use both null and non-null types
    // And the app won't crash due to the property not being set
    private val inventory: Inventory by lazy {
        Inventory(25, 50, 10, 15)
    }

    fun open(personInCharge: String) {
        manager = personInCharge
        isOpen = true
    }

    fun close() {
        isOpen = false
    }

    // This is the point where the inventory property is first accessed
    // So once this function runs, then the lazy code block will run
    fun checkInventory(): Inventory {
        return inventory
    }

    data class Inventory(
        val phones: Int,
        val chargers: Int,
        val headphones: Int,
        val memoryCards: Int
    )

}

val shop = Shop()
shop.isOpen
shop.open("Gary")
println("Is shop open? ${shop.isOpen}")
println("Manager for the day: ${shop.manager}")
shop.checkInventory()

class Counter {

    val sumOf1to10 = 55

    // Use 'lazy initialization' to prevent complex code from running if it's never requested
    // The word 'lazy' means exactly this; I will only run this code if I have to
    private val sumOf1to50: Int by lazy {
        println("Inside the start of the lazy block...")
        var total = 0

        // This Kotlin-only syntax is used for looping through a sequence of numbers
        // Create a variable 'i', then it will be set to each number for every loop
        for (i in 1..50) {
            println("i = $i")
            total += i
            println("total = $total")
        }

        total
    }

    fun calculateSumOf1to50() = sumOf1to50

}

val counter = Counter()

println(counter.sumOf1to10)

println(counter.calculateSumOf1to50())