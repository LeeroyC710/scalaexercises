object collections {
val list: List[String] = List(
  "Corona",
  "Stella",
  "Guinness"
)
  println(list(0))
  println(list.head)
  println(list.last)
  println(list.tail)

  val list2 = list :+ "Fosters"
  // List(Corona, Stella, Guinness, Fosters)val list3 = "Peroni" +: list2
  // List(Peroni, Corona, Stella, Guinness, Fosters)val combinedList = list ::: list2
  // List(Corona, Stella, Guinness, Corona, Stella, Guinness, Fosters)val emptyList = List.empty
  val vector = Vector(1,2,3)
  vector updated(1, 5)
  println(vector)
}
