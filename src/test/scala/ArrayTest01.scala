/**
 * Created by nabedge on 2014/11/03.
 */
object ArrayTest01 extends App {

  var strings: Array[String] = null
  var values: Array[Int] = null

  strings = new Array[String](10)
  values = new Array[Int](10)

  var strings3 = Array("One","Two","Three")
  var values3 = Array(1,2,3)
  println(strings3(1))
}
