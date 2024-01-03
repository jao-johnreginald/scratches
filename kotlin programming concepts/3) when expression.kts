fun navigate(navigation: String) {
    // Type the word 'when', followed by a variable/value in brackets
    when (navigation) {
        /*
        For each option, type the value the variable could be
        followed by an arrow ->
         */
        // The code can be inside a block {} - useful for multiline
        "login" -> {
            println("You have reached the login screen")
            println("Please enter your credentials")
        }
        // If you only have one line, you can write it without the block {}
        "registration" -> println("You have reached the registration screen")
        "terms" -> println("You have reached the Terms & Conditions screen")
        else -> println("Invalid Destination")
    }
}

navigate("login")
navigate("settings")

/*
When statements don't have to evaluate a value/variable
They can contain raw logic on each line, as below
To do this, DON'T have brackets () after the 'when' statement
 */
fun passwordChecker(password: String) {
    when {
        password.length < 6 -> println("too short")
        password == "password" -> println("too predictable")
        password.contains("aaaa") -> println("too many repeated 'a's")
        else -> println("good enough for me")
    }
}

passwordChecker("hello")
passwordChecker("password")
passwordChecker("aaaaapples")
passwordChecker("2001january01")

/*
Expression - 'if' or 'when' statement that directly returns a value
Using a 'when expression', like with if - else blocks, it's possible
to assign a variable directly from a 'when expression'.
 */
fun getDifficulty(level: Int): String {
    val difficulty = when (level) {
        1 -> "Easy"
        2 -> "Medium"
        3 -> "Hard"
        else -> "Invalid Level Input"
    }
    return difficulty
}

getDifficulty(1)
getDifficulty(2)
getDifficulty(3)
getDifficulty(4)

// As a 'when expression' can return a value, we can simply
// return the 'when expression' directly.
fun getDifficultyInline(level: Int) = when (level) {
    1 -> "Easy"
    2 -> "Medium"
    3 -> "Hard"
    else -> "Invalid Level Input"
}

getDifficultyInline(1)
getDifficultyInline(2)
getDifficultyInline(3)
getDifficultyInline(4)