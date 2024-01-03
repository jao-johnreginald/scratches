/*
NON NULL VARIABLES
By default, variables cannot be null. When declared we must assign it.
 */
var nonNullVariable : String = "hello"

// var unassignedNonNullVariable: String -> Won't work. Must assign non-null variables when declared.

// Note: We can call methods on non-null variables as normal
nonNullVariable.uppercase()

/*
NULLABLE VARIABLE
To declare that a variable CAN be null, we ad a '?' after the type
 */
var nullableVariable: String? = null

// var unassignedNullableVariable: String? -> Won't work. We must assign to something, including 'null'

nullableVariable = "Barney just assigned me a value"

// Note: We can make it null again if we want. This variable is 'nullable'
nullableVariable = null

// nullableVariable.uppercase() -> Won't work. This is a 'nullable' variable


/*
NULL SAFETY
We have to take extra steps when dealing with nullable variables
 */
var barneyNullVariable: String? = "Assigned, but can still be null"

/*
The first way Kotlin handles null variables is 'Safe Call'
To call any property or method on a nullable variable, we can do a 'Safe Call'
We put a '?' after the variable, then we can call the method or property
 */
barneyNullVariable?.uppercase()

// If the variable is null, the the whole line of code will return a null value instead
barneyNullVariable = null
barneyNullVariable?.uppercase()
barneyNullVariable?.lowercase()?.uppercase()

/*
The other way is 'Non-Null Assertion'
If we are certain a variable will not be null, we can do a 'Non-Null Assertion'
We put a '!!' after the variable, then we can call the method or property
 */
barneyNullVariable = "Now it's not null"
if (barneyNullVariable != null) {
    barneyNullVariable!!.uppercase()
}
// Note: We must be sure about this. If we are wrong, and it IS null, this will throw an Error