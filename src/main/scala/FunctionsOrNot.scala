/*
Excerise can be found at https://www.hackerrank.com/challenges/functions-or-not/problem
 */
object FunctionsOrNot {

  def numOfTestCases: Int = scala.io.StdIn.readInt()

  def pairsInTestCases(numOfTestCases: Int): IndexedSeq[List[(Int, Int)]] =
    1 to numOfTestCases map { _: Int =>
      val numPairsInTestCase: Int = scala.io.StdIn.readInt()
      Utils.readPairs(numPairsInTestCase)
    }

  def main(args: Array[String]): Unit = {
      pairsInTestCases(numOfTestCases) foreach { pairsForTestCase =>
      val values = pairsForTestCase.map(_._1)
      if (values.distinct.size != values.size)
        println("NO")
      else
        println("YES")
    }
  }
}