object conditionals {
  var day = "Friday"
  if ("Friday" == day){
    println("Yay it’s Friday")
  }
val whatDayItIs = if (!day.isEmpty) day //check that the variable is not empty and so
  //return its value
  println(whatDayItIs) // will print out -> Friday
  // another example using if, else if, else
  if (day.isEmpty){
    println("Unable to figure out what day it is...")
  } else if ("Friday" == day) {
    println("Yay its Friday")
  } else {
    println("Its still not Friday...")
  }
}
