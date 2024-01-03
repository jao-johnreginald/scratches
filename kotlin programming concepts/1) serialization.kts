import java.io.Serializable

// A normal data class
data class Person(val name: String, val age: Int)

// When we make a new object, this instance is live in 'memory'
// It lives within the runtime environment for our app (Android Runtime/ART)
val person = Person("Rainier", 15)

/*
If we want to send an object somewhere outside of our current live environment, we need to 'persist' (save/store) it
This is necessary to pass data in an Intent, particularly as Intents can be used to pass data to other Android apps
An Intent can automatically persist simple variables (int, boolean, String etc.)
However, an instance of a class (an object) cannot be automatically persisted
 */

/*
One quick and easy way to persist an object is through 'Serialization'
It is the process of taking a living object, converting it to some 'bytes', saving that somewhere,
then reading those 'bytes' and recreating the object exactly as it was
 */

/*
Steps:
1) We tell Java that our class can be persisted by adding ' : Serializable' after the class
2) Our class can then be Serialized when needed, like being put into an Intent, writing to a file, etc.
3) The living object is converted into a stream/sequence of bytes
4) These bytes are saved somewhere (File, database, a different memory)
5) When needed, these bytes are read from where they were persisted/stored
6) These bytes are used to recreate the object as it was before
 */

// We add : Serializable to tell Java that instances/objects of this class can be persisted/stored
data class SerializablePerson(val name: String, val age: Int) : Serializable