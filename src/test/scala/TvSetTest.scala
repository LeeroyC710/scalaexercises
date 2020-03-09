import org.scalatest.{FeatureSpec, GivenWhenThen}

class TvSetTest extends FeatureSpec with GivenWhenThen {
  feature("TV power button") {
    scenario("User presses power button when TV is off") {
      Given("a TV set is off")
      val tv = new TvSet
      assert(!tv.isOn)
      When("the power button is pressed")
      tv.pressPowerButton()
      Then("the TV should switch on")
      assert(tv.isOn)
      }
    }
  }