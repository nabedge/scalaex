package com.example.c3

object IfTest01 extends App {

  val condition = true
  if (condition) {
    println("condition is true")
  }

  val str = if (condition) {
    "aaa"
  }

  println(str)

  var max = 0
  var a = 23
  var b = 69
  max = if (a > b) a else b
  println(max)
  a = 99
  println(if(a > b) a else b)

}
