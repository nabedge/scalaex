package c2

object ArgumentNameTest01 extends App {

  //受け取った名前と年齢の表示
  def nameAge(name: String, age: Int): Unit = {
    println("名前 " + name + ",年齢 " + age)
  }

  nameAge("foo", 20)//値をそのまま渡す場合
  nameAge(name="bar", age=30)
  nameAge(age=30, name="xxxx")

}
