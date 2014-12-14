package c3

object WhileTest02 extends App {

  // 5x4x3x2x1
  def fac_w(n:Long): Long = {
    var i:Long = n
    var result:Long = 1L
    while (i >= 1L) {
      result *= i
      i -= 1L
    }
    result
  }
  println(fac_w(99L))

  // 再起呼び出しを使った階乗計算
  def fac_r(n:Int): Int = {
    if (n==1) { 1 } else { n * fac_r(n - 1)}
  }
  println(fac_w(5))


}
