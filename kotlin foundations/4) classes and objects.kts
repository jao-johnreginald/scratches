// Classes are very similar to Java
class Barney {

    var tailColor: String? = null

    fun introduceMyself() {
        println("Barney is a dinosaur from our imagination, the color of my tail is $tailColor.")
    }

}

// In Kotlin, we don't need the 'new' word when we make a new object
val dinosaur = Barney()
dinosaur.tailColor = "purple"
dinosaur.introduceMyself()

/*
Constructors immediately follow the class name, and adding 'val/var' makes the value a Class property
This has the same effect of creating properties inside the class body {} like normal
Because we demand these values in the constructor, it's okay to be non-null or not have '?'
We can choose 'var' or 'val', and we can also have 'Access Level Modifiers' like 'private' ('public' by default)
 */
class ClassWithConstructor(var classVar: String, var nullableVar: String?, val fixedVal: Int, private var privateProperty: String) {

    // This is how you override a method in Kotlin, The '@Override' annotation is in the same line as the method
    override fun toString(): String {
        return "classVar: $classVar, nullableVar: $nullableVar, fixedVal: $fixedVal, privateProperty: $privateProperty"
    }

}

val constructorTest = ClassWithConstructor("Original Text", null, 69, "Private Property")
println(constructorTest)

// Changing the class properties
constructorTest.classVar = "I changed it"
constructorTest.nullableVar = "Not null anymore"
constructorTest.fixedVal // Can't be changed because it is a 'val' and not a 'var'
// constructorTest.privateProperty -> Can't be accessed because it is 'private'

/*
Data Classes are used if the class mainly just holds values
This comes with a few benefits, one of which is a useful descriptive 'toString()' method
 */
data class DataClass(val string: String, val boolean: Boolean, val int: Int)

val dataClass = DataClass("Barney", true, 69)
println(dataClass)