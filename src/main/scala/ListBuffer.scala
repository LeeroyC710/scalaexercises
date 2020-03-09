object ListBuffer {
  val buf = ListBuffer.empty[Int]

  buf += 1
  buf += 10
  buf.toList
}
