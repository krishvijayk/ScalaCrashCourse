// Values are immutable constants
val hello: String = "Hola!"

var helloThere: String = hello
helloThere=hello+ " There!"
print(helloThere)

val immutableHelloThere = hello+ " There"
println(immutableHelloThere)

// Data Types
val numberOne: Int =1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159265
val piSinglePrecision: Long = 1234567
val smallNumber: Byte = 127

println("Here is a mess: "+numberOne+truth+letterA+pi+piSinglePrecision+smallNumber)

//Display value for 3 decimal precision
println(f"pi is about $pi%.3f")

//Zero padding on the left
println(f"Zero padding on the left: $numberOne%05d")


//Use of Regular Expressions
val theUltimateAnswer: String = "To life, the universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer= answerString.toInt
println(answer)

//Booleans
val isGreater = 1>2
val isLesser = 1<2
val impossible = isGreater & isLesser // Single Amberstant is a bitwise
val anotherWay = isGreater && isLesser //Double Ambersant is a logic operation
val checkor = isGreater || isLesser 

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard ==bestCaptain
