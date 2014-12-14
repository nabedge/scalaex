package c4

// 丁寧な感謝の挨拶をするクラス。extendsの後ろで親クラスのコンストラクタを呼び出す
class ConstructorTest03Sub(name: String) extends ConstructorTest03Super(name) {

    thanks = "Thank you very much. "

}

object ConstructorTest03Main extends App {

  val test01 = new ConstructorTest03Super("Charlie")
  test01.sayThanks()

  val test02 = new ConstructorTest03Sub("Charlie")
  test02.sayThanks()

}