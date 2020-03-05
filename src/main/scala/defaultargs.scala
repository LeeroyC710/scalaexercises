object defaultargs {
  def myFullName(firstName: String = "", lastName: String = ""): Unit = {
    if (!firstName.isEmpty && !lastName.isEmpty) {
      println(firstName + "" + lastName)
    } else if (!firstName.isEmpty) {
      println(firstName)
    } else {
      println(lastName)
    }
  }
  myFullName("John") // will print out John as the value we are passing will be considered to be the firstName and for the
  // last name the value will be taken as empty string by default if no value is passed myFullName(“John”, “Smith”)
  // will print out John Smith as we’re passing both values that are expected
  // myFullName(lastName =“Smith”, firstName =“John”)
  // will print out John Smith as we passed the values by name and not by order
}