package c4

object CompanionTest02 {
  def apply(id:Int, name: String): CompanionTest02 = {
    new CompanionTest02(id,name)
  }
}

class CompanionTest02(var id: Int, var name: String) {

  def printAll(): Unit = {
    println(id + " : " + name)
  }

}
