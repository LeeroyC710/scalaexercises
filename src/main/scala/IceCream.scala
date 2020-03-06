object IceCream extends Enumeration {

  val VANILLA = Value(0, "Vanilla")
  // the first argument passed integer that has to be unique between all the values and
  // the second argument is the actual value we want to store
  val CHOCOLATE = Value(1, "Chocolate")
  val STRAWBERRY = Value(2,"Strawberry")
}
println(s"i'm eating ${IceCream.CHOCOLATE} ice cream")
// will be evaluated to -> i'm eating Chocolate ice cream

IceCream.values.foreach{
  case iceCream if iceCream.CHOCOLATE == iceCream =>
    println(s"We have ran out of $iceCream ice cream")
  case iceCream: IceCream => println(s"We still have $iceCream")
}
// will be evaluated to ->
// we still have vanilla
// we have ran out of chocolate ice cream
// we still have Strawberry