package c4

class ConstructorTest03Super(name: String) {

  protected var thanks = "Thank you"

  def sayThanks(): Unit = {
    println("Hi, " + name + ". " + thanks)
  }

}
