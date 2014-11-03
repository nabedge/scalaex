/**
 * Created by nabedge on 2014/11/03.
 */
object FunctionTest02 extends  App {

  def addNums(nums:Int*):Int = {
    var total = 0;
    for(num <- nums) {
      total += num
    }
    return total
  }

  println(addNums(1,2,3,4,5,6))

  val numList = List(1,2,3,4)

  println(addNums(numList:_*))

}
