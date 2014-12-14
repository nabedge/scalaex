package c3

/**
 * Created by nabedge on 2014/11/18.
 */
object SwitchMatchTest01 extends App {

  // 0なら青、１なら黄、2なら赤、その他はエラーという文字列を返すメソッド
  def colorString(num: Int): String = {
    num match {
      case 0 => "青"
      case 1 => "黄"
      case 2 => "赤"
      case _ => "エラー"
    }
  }

  println(colorString(1))
  println(colorString(2))
  println(colorString(20))

}
