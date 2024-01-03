// Map - A collection that holds key value pairs. Read-only access; you can't add more data after initialisation
// HashMap - A Map, but with read and write access; you can add/amend/delete key value pairs after initialisation

// Creating Maps/HashMaps

// We can use hashMapOf() and mapOf() as a Kotlin convenience function to make a new HashMap/Map
val emptyHashMap: HashMap<String, String> = hashMapOf() // Empty HashMap, so we need to declare the Key-Value type
val emptyMap: Map<String, Int> = mapOf() // Maps are read-only, so we cannot add new data, so this is useless

// We can also use the traditional way of creating a new HashMap object, this would work in Java with the 'new' word
val aHashMap: HashMap<String, Boolean> = HashMap()
//val aMap: Map<Double, String> = Map() -> This won't work, 'Map' is actually just an interface, with read only methods

// For consistency with Arrays, and convenience, it is recommended to use hashMapOf(), mapOf(), and arrayOf()


// Updating and accessing values in HashMaps

val pets: HashMap<String, String> = hashMapOf()

// We can use put(Key, Value) to store/update a key value pair in a HashMap
pets.put("Pigger", "Panda") // It is better to use [] because it makes it consistent with Arrays and their Index

// We can also use [] to refer to the Key
pets["Max"] = "Dog" // We can use = to assign a value to that key, similar to how we assign values to new variables

// We can use get(Key) to retrieve the value for a specified Key
pets.get("Pigger") // Will get a suggestion to use [] just like for 'put'

// Using square brackets [] is the recommended way to access a Value by its key
pets["Max"]
pets["Max"] = "Dalmatian Dog" // We can update any existing values in the same way as we create new ones
pets["Max"]

// To remove a key value pair, we simply use remove(Key)
pets.remove("Pigger")
pets["Pigger"]

// We can put any type for the Key or the Value, this can include custom Classes
data class Student(val name: String, val age: Int, val nationality: String)

val studentData: HashMap<String, Student> = hashMapOf()

val chang = Student("Chang",  22, "Chinese")
val jamal = Student("Jamal", 21, "Black")

studentData["1234"] = chang
studentData["4321"] = jamal
studentData["4444"] = Student("Stacy", 18, "Blonde")

studentData["1234"]
studentData["4321"]
studentData["4444"]


// Map Initialisation

// We can add initial values with the hashMapOf() and mapOf() functions
// These values can be Pair objects -> Pair(Key, Value)
val bankBalance: HashMap<String, Double> = hashMapOf(
    Pair("GreedyBank", -59.34),
    Pair("NiceBank", 145.78),
    Pair("bdoBank", 187.23)
)

bankBalance["GreedyBank"]
bankBalance["NiceBank"] = 240.12 // As we have a HashMap, we can change the value
bankBalance.remove("bdoBank")

// You can also add Key Value pairs using 'Key to Value'
// This is a shorthand for Pair(Key, Value)
val reportCard: Map<String, String> = mapOf(
    "English" to "A",
    "Maths" to "A+",
    "Science" to "B+",
    "Music" to "C+"
)

// Type Inference

// If you initialise your HashMap/Map with Key-Value pairs, you don't need to specify the types
val secretAccess = hashMapOf(
    "Basement" to true,
    "Laboratory" to false,
    "Staff Room" to true,
    "CEO Room" to false
)

// Once the Key and Value type are set, you cannot put any other types in
//secretAccess["Access Level"] = 12 -> This won't work, the Value type is fixed as Boolean

// Final Notes

/*
1. Keys must be unique, you cannot have the same key twice
2. Types can be nullable, but you must specify if this is the case e.g. Map<String, Int?>
3. HashMap got its name with the word 'Hash' because whatever you have in your key
It is 'hashed' into a short, simple, unique value
 */