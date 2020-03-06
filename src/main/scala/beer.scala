// defining a class with parameters
class beer(val beerName: String, var quantity: Int){
  override def toString: String = s"The beer is $beerName and the quantity is $quantity"

  // creating the objects of beer class
  val guinness = new Beer("Guinness", 10)
  val corona = new Beer("Corona", 5)

  // calling the toString method on the created objects
  println(guinness.toString)
  // would be evaluated to -> The beer is Guinness and the quantity is 10
  println(corona.toString)
  // would be evaluated to -> The beer is Corona and the quantity is 5
  // accessing the values and reassigning the values to them
  println(guinness.quantity) // would be evaluated to -> 10
  guinness.quantity = 100
  println(guinness.toString)
  // would be evaluated to -> The beer is Guinness and the quantity is 100
}

class Beer(val beerName: String, var quantity: Int){
  def this(beerName: String) = this(beerName, 0)
  def printInfo(): Unit = quantity match {
    case 0 => println(s"The beer is $beerName and the quantity is $quantity")
    case _ => println(s"The beer is $beerName")
  }
}
val guinnessWithQuantity = new Beer("Guinness", 10)
guinnessWithQuantity.printInfo()
//will be evaluated to 10
val guinnessWithoutQuantity = new Beer("Guinness")
guinnessWithoutQuantity.printInfo()

class Juice (juiceType: String, description: String,
             quantity: Int) {
  def this(juiceType: String) = this(juiceType, "", 0)

  def this(juiceType: String, description: String) = this(juiceType, description, 0)

  override def toString: String = "%s juice %s, quantity %s" format(juiceType, description, quantity)
}
// we're only passing type of juice when creating an instance of Juice
val orangeJuiceWithTypeOnly = new Juice("Apple", "from home grown apples")
println(orangeJuiceWithTypeOnly.toString)
// as there is no description passed the expression will be evaluated to -> Apple juice, quantity 0
// we're passing type, and description of juice when creating an instance of Juice
val orangeJuiceWithTypeAndDescription = new Juice("Apple", "from home grown apples")
println(orangeJuiceWithTypeAndDescription.toString)
// will be evaluated to Apple juice home grown apples, quantity 0