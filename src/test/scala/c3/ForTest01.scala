package c3

object ForTest01 extends App {

  //
  for (i <- 0 until 5) {
    print(i)
  }
  println("")

  for (i <- 0 to 5) print(i)
  println("")

  for(i<-5 to 1 by -1) print(i)
  println("")

  for (_ <- 1 to 5) print("hello ")



}
