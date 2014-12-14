package c3

object ForTest07 extends App {

  // int型の配列から偶数のデータを取り出し、文字列に変換し、新たな文字列配列を作成する
  val iData = Array(1,2,3,4,5,6,7)
  val strNumbers = for (i <- iData if i % 2 == 0 ) yield { i.toString() }
  strNumbers.foreach(println(_))
}
