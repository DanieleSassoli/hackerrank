/*
  Excercise can be found at https://www.hackerrank.com/challenges/common-divisors/problem
 */
object CommonDivisors {

  def getDivisors(num1: Int, num2: Int): IndexedSeq[Int] = {
    val max = ((if(num1 > num2) num1 else num2) / 2) + 1
    1 to max collect {case x: Int if num1 % x == 0 && num2 % x == 0 => x}
  }

  def main(args: Array[String]): Unit = {
    val numTestCases: Int = scala.io.StdIn.readInt()
    val pairs = Utils.readPairs(numTestCases)
    val commonDivisors: List[IndexedSeq[Int]] = pairs.map { case (x, y) =>
      val lastElem = if(x == y) List(x) else List()
      getDivisors(x, y) ++ lastElem
    }
    commonDivisors foreach (x => println(x.size))
  }
}
