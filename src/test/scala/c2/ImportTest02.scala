package c2

object ImportTest02 extends App {

  def foo:Unit = {
    import java.util.{Date, Random}
    println(new Date)
    println(new Random().nextInt)

    // 短い別名にしてインポート
    import java.io.{BufferedReader => BR, FileReader => FR}
    try{
      val reader = new BR(new FR("foo.txt"))
    } catch  {
      case e:Exception =>
    }

  }

  foo
}
