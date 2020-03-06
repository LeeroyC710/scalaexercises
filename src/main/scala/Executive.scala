package Society {
  package Professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      println(secrets)
  // allowed to while inside of the class
  def help (another: Executive): Unit = {
    println(another.workDetails)
    println(another.friends)
    println(another.secrets)
    // not allowed to here even though the method is inside the class
      }
    }
  }
}
