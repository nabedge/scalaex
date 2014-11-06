package com.example.c3

import scala.util.control.Breaks.break
import scala.util.control.Breaks.breakable

// 0が入力されるまで入力された数字を加算する
object BreakTest01 extends App {

  var total = 0
  breakable {
    while (true)     {
      print("input number:")
      val i = readInt()
      if (i == 0) break
      total += i
    }
  }
  println("total is " + total)
}
