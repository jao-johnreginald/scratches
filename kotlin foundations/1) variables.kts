// Type 'var' for a variable, then the name, then a colon followed by the type
var purpleDinosaur: String = "barney is a dinosaur"
purpleDinosaur
purpleDinosaur = "barney is not a dinosaur anymore"
purpleDinosaur


// In kotlin, Int is with capital I. Type 'val' for unchangeable variable
val myFixedValue: Int = 6
myFixedValue
// myFixedValue = 3 -> THIS WON'T WORK. A 'val' can't be changed once assigned


// No need to specify the type. Kotlin can 'infer' the type from the assignment
var myInferredVariableType = "no need to specify the type"
myInferredVariableType
// myInferredVariableType = 7 -> THIS WON'T WORK. The 'inferred' type is String


// REMEMBER: 'var' for variable (it varies). 'val' for value (fixed value).