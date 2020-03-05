object iteration {
  import utiyl.control.breaks.
  breakable {
  for (i <- 1 to 10) {
    println(i)
    if (> 4) break // if i is greater than 4 we break out of loop
  }
}
