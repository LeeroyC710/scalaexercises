object arrays {
  val array = Array(
    "Corona",
    "Stella",
    "Guinness"
  )
  array(0) // Corona
  array.head// Corona
  array.last// Guinness
  array.tail// Array(Stella, Guinness)

  val dimensionalArray = Array.ofDim[Int](2, 2)
  dimensionalArray(0)(0) = 1
  dimensionalArray(0)(1) = 2
  dimensionalArray(1)(0) = 3
  dimensionalArray(1)(1) = 4

  val rangedArray = (1 to 10).toArray[Int] // Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
}
