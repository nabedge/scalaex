package c4

object CompanionTest02Main extends App {

  // newを書かずにインスタンス生成
  val test01 = CompanionTest02(1, "Taro")
  test01.printAll()

  // applyメソッドで明示的にインスタンス生成
  val test02 = CompanionTest02.apply(2, "Hanako")
  test02.printAll()

  // newを使った一般的なインスタンス生成
  val test03 = new CompanionTest02(3, "Jiro")
  test03.printAll()

}
