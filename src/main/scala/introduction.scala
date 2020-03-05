object introduction {
  def main(args: Array[String]) = {}
  println("Hello World!")

  def welcomeUser(name:String): Unit = println("Hello " + name)
  welcomeUser("Leeroy") //here we're calling our example function
  // welcomeUser and pass the name as an argument it will print out
  //hello Leeroy
  // another example function
  def isEven(number: Int): Boolean =
    if (number % 2 == 0)
        true
    else
        false

  isEven(2) //calling the function will return true
  isEven(3) //calling the function will return false
}
