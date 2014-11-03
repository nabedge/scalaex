/**
 * Created by nabedge on 2014/11/03.
 */
object DefaultValueTest01 extends App {

  def greetingWorld(no: Int, name:String = "World", repeat:Int =1):Unit = {
    print(no + ":")
    for(i <- 0 until repeat) {
      println("Hello," + name)
    }
  }

  greetingWorld(no=1)
  greetingWorld(no=2, name="foo")
  greetingWorld(no=3, "foo", 3)

}
