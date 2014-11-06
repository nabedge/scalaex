package c2

object NonPeriodTest01 extends App {

  object Hello {
    def say() = println("hello")
  }

  Hello.say()
  Hello say()
  Hello.say
  Hello say
}
