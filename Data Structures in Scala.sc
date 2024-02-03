//Data Structures

//Tuples
//Immutable Lists

val captainStuff = ("Picard","Enterprise-D","NCC-1701-D")
//captainStuff is a single object
println(captainStuff)
//Refer to the individual fields with a one based index
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

//Key value Pairs
val picardShip = "Picard" -> "Enterprise-D"
println(picardShip._2)

val aBunchofStuff = ("Kirk", 1964,true)
print(aBunchofStuff._1)

//Lists
//All the elements in  the list must be of same data type
//Single Linked List
val ShipList = List("Enterprise","Voyager","Deepspace")
println(ShipList(0))
println(ShipList(1))
println(ShipList.head)
println(ShipList.tail)

//Iterate and print all the elements in a list
for (ship <- ShipList ) {println(ship)}

//Applying function literal to a list
//Applying map to every element in a list
val backwardShips = ShipList.map( (ship: String) => {ship.reverse})
for (ship <-backwardShips) {println(ship)}

//reduce to combine all the items in a collection
val numberList = List(1,2,3,4,5)
val sum=numberList.reduce((x:Int,y:Int) => x+y)

// Filter to remove unneccesary elements
val iHateFives = numberList.filter((x: Int) => x!=5)

val iHateThrees = numberList.filter(_!=3)

//List Concatenation
val moreNumbers = List(6,7,8)
val lotsofNumbers = numberList ++ moreNumbers

val reversed = numberList.reverse
val sorted =numberList.sorted

val lotsofDuplicates = numberList ++ numberList

val distinctValues = lotsofDuplicates.distinct
val maxValue = numberList.max
val total = numberList.sum
val hasthree = numberList.contains(3)

//Maps
val shipMap=Map("Kirk" -> "Enterprise","Sisko" -> "Deep Space Nine","Janeway"->"Voyager")
println(shipMap("Janeway"))
println(shipMap.contains("Archer"))
//Handling with missing values
val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archersShip)

// Create a list of numbers from 1-20; your job is to print out numbers that are evenly 
   //distributed by three 
val moreNumbers = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
val MultiplesofThree = moreNumbers.filter((x: Int) => x%3==0)
print(MultiplesofThree)



