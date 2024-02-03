//Functions

def squareIt(x: Int) : Int ={
  x+x
}

def cubeIt(x:Int): Int={x*x*x}

println(squareIt(2))
println(cubeIt(3))
// Functions with functions as parameter

def transformInt(x: Int,f: Int=>Int): Int=
{
  f(x)
}

val result=transformInt(2,cubeIt)
println(result)

// Passing inline function
transformInt(3,x=>x*x*x)

transformInt(10,x=>x/2)

transformInt(2,x=>{val y = x+2; y*y})

//Write a function that converts a string to upper-case and use that function of a few test strings.
def transformString(x: String, f: String => String): String = {
  f(x)
}
transformString("foo",x=>x.toUpperCase)
