/**
 * Created by nabedge on 2014/11/03.
 */
object FunctionTest01 extends App {

  def add(x:Int,y:Int): Int = {
    return x+y
  }

  def printString(strings: String*):Unit = {
    for(str <- strings){
      println(str)
    }
  }

  println(add(1,2))
  printString("aaa","bbb")

}
