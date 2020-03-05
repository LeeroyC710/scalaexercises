class Person(var name: String, var age: Int)

object maindef extends App {

  def showEvaluationOnDefine() : Unit = {
    val person = new Person("Leeroy", 26)
    // the value is evaluated on the definition therefore even without us calling it first        // it will automatically have that value assigned to the variable
    // this example will print out -> Persons age is: 36
    println("Persons age is: " + person.age)

    // we reassign the value of the persons age
    person.age = 32

    // and then we call the val to get the persons age again
    // this example will print out -> Persons age is: 32
    // the age change
    println("Persons age is: "  + person.age)
  }
  showEvaluationOnDefine()
}
