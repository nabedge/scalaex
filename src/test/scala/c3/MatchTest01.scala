package c3

/**
 * Created by nabedge on 2014/11/18.
 */
object MatchTest01 extends App {

  // コレクションでのマッチング
  def checkArray(array: Array[Int]):String = {
    array match {
      case Array(1,2) => "Array(1,2)"
      case Array(2, _) => "配列の初めは2"
      case _ => "unmatch"
    }
  }

  println(checkArray(Array(1,2)))
  println(checkArray(Array(2,10)))
  println(checkArray(Array(1,100)))

}
