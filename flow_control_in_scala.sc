//Flow Control

//If / else:
if (1 > 3) println("Impossible") else println("The World makes Sense")

if (1>3) {
  println("Impossible!")
  println("Really?")
} else {
  println("The World makes sense.")
  println("still.")
}

//Matching
val number=3
number match{
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _=>println("Something else")
}

for (x <- 1 to 4) {
  val squared = x+x
  println(squared)
}

//while loop
var x = 10
while (x>=0) {
  println(x)
  x -=1
}

x=0
do { println(x); x+=1 } while (x<=10)

//Expressions
{val x=10; x+20}

println({val x=10; x+20})


// Exercise to print fibannoci series
while (x<=10) {
  if (x <= 1) x
  else {
    var a = 0
    var b = 1
    for (i <- 2 to x) {
      val sum = a + b
      a = b
      b = sum
    }
    b
  }
}





