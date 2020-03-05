class Person (var name: String, var age: Int)

object main extends App {
  def showEvaluationOnCall() : Unit = {
    def person = new Person("Leeroy", 26)
    //we evaluate the value when we call the method
    //this example will print out -> Persons age is: 36
    println("Persons age is: " + person.age)

    // we reassign the value of the persons age
    person.age = 27

    // and then we call the method to get the persons age again
    //this example will print out -> Persons age is: 26
    //the age does'nt change because every time we try to get the age
    //we re-evaluate it meaning that it will one again be 26
    println("Persons age is: " + person.age)
  }
  showEvaluationOnCall()
}
