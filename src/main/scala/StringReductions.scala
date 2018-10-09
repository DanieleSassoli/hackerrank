/*
Excerise can be found at https://www.hackerrank.com/challenges/string-reductions/problem
 */
object StringReductions {
  def main(args: Array[String]): Unit = {
    val str = scala.io.StdIn.readLine()
    str.toList.distinct.mkString("")
  }
}
