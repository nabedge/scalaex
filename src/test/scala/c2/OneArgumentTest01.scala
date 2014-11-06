package c2

/**
 * Created by yu.watanabe on 2014/11/06.
 */
object OneArgumentTest01 extends  App {

  println("hello")

  println({
    var a=1
    a+=2
    a
  })

  println {
    var a=11
    a
  }

  var list1 = Array.apply(1,2,3)
  //list1.foreach(v => println(v))
  println(list1.mkString(","))
}
