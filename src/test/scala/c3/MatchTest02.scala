package c3

/**
 * Created by nabedge on 2014/11/18.
 */
object MatchTest02 extends App {

  //データ型でのマッチング
  def checkDataType(obj: Any):String = {
    obj match {
      case _: Int => "Int型"
      case _: String => "String型"
      case _ => "IntでもStringでもない"
    }
  }

  println(checkDataType(1))
  println(checkDataType("1"))
  println(checkDataType(None))

}
