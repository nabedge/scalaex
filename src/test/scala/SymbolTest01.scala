/**
 * Created by nabedge on 2014/11/03.
 */
object SymbolTest01 extends App{

  val symbol01 = Symbol("abc")
  val symbol02 = Symbol("abc")
  val symbol03 = 'abc
  println(symbol03.name)
  println(symbol01.toString())
  println(symbol01 == symbol03)

  println(symbol01 eq symbol02)
  println(symbol02 eq symbol03)

}
