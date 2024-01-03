// Functions start with the word 'fun', then the name of the function
fun makeNoise() {
    println("YEE HA!")
}

makeNoise()

// Parameters are the name of the parameter, then a :, then the Type (like a variable)
fun greet(name: String) {
    println("Hello $name!")
}

greet("Rainier")

// Multiple parameters are separated by a comma, just like Java
fun birthdayCake(name: String, age: Int) {
    println("Happy Birthday $name! Now, blow out your $age candles!")
}

birthdayCake("Rainier", 15)

/*
To specify a return type, it is a :, AFTER the parameter brackets
followed by the type, before the '{'
If you don't specify a return type, it will return 'Unit' which means 'void' in Java
 */
fun multiply(numberOne: Int, numberTwo: Int): Int {
    return numberOne * numberTwo
}

val result = multiply(5, 5)
println(result)

/*
*** Three ways to do a one-liner function which returns something ***
The regular way, with curly braces { }, the word 'return' and specifying the return type
 */
fun square(number: Int): Int {
    return number * number
}

// As a 'one-liner' (function 'expression'), with NO curly braces, and instead using '=' after specifying the type
fun squareTwo(number: Int): Int = number * number

// As a 'one-liner' (function 'expression'), and INFERRING the return type (no need to specify the return type)
fun squareThree(number: Int) = number * number

square(2)
squareTwo(3)
squareThree(4)