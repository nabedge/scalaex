package c2

/**
 * Created by yu.watanabe on 2014/11/06.
 */
object UpdateTest01 extends App {
  val numbers = Array(1,2)
  println(numbers.mkString(","))
  numbers.update(0,3)//最初の要素を3に置き換え
  println(numbers.mkString(","))
  numbers(1) = 4 // 2番めの要素を4に置き換え
  println(numbers.mkString(","))

}
