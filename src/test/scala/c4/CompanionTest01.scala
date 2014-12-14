package c4

object CompanionTest01 {

  // static field
  var pubStaField = "PublicStaticInit"
  private var priStaField = "PrivateStaticInit"

  // static method1
  def printSta(): Unit = {
    println(pubStaField + ":" + priStaField)
  }

  def main(args: Array[String]): Unit = {
    printSta()
    val test = new CompanionTest01()
    test.printNonSta()
    test.printAll()
    println(test.pubField)
    println(test.priField)
  }

}

class CompanionTest01 {

  // non-static fields
  var pubField = "PublicInit"
  private var priField = "PrivateInit"

  // non-static method1
  def printNonSta(): Unit = {
    println(pubField + ":" + priField)
  }

  // non-static method2
  def printAll(): Unit = {
    println(CompanionTest01.pubStaField + ":" + CompanionTest01.priStaField + ":" + pubField + ":" + priField)
  }

}