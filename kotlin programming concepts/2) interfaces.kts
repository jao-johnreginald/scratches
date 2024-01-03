/*
Interface - A point where 2 systems/subjects meet and interact
Example: A computer User -> A computer. There is the 'User Interface' (Windows/MacOS), display, mouse, keyboard
The user can use a mouse/cursor to click on icons/symbols to request the computer to do things like return photos, files
The computer then returns its output to the user on the same screen/interface
The user does not directly control the computer; the circuit board, or read the bytecode data
Instead, the computer and the user meet in this 'User Interface'
 */

// Interfaces are like a Class. We type 'interface' then the name of the Interface
interface CoffeeProvider {

    // Then we type all the methods including parameters or return types, but we DON'T write a method body
    fun serveCoffee()

    fun greet(name: String): String

}

// Think of Interfaces like a CONTRACT. If something is a 'Coffee Provider' then it promises to have these methods

class McDonaldCoffeeProvider: CoffeeProvider {
    override fun serveCoffee() {
        println("McDonald's coffee provider is broken so I cannot serve coffee.")
    }

    override fun greet(name: String): String {
        return "Hello, $name! I am a useless broken coffee provider."
    }
}

val mcDonaldCoffeeProvider = McDonaldCoffeeProvider()
val greeting = McDonaldCoffeeProvider().greet("Rainier")
println(greeting)
mcDonaldCoffeeProvider.serveCoffee()