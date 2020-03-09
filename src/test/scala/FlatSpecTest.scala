import org.scalatest.FlatSpec
class FlatSpecTest extends FlatSpec {
  "An empty Set" should "be empty" in {
    assert(Set.empty.isEmpty)
  }
  it should "produce NoSuchElementException when head is invoked on an empty Set" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
