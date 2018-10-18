/*
  Excercise can be found at https://www.hackerrank.com/challenges/remove-duplicates/problem
 */
object RemoveDuplicates {
  def main(args:Array[String]): Unit = {
    val str = scala.io.StdIn.readLine().toList

    println(str.distinct.mkString(""))
  }
}
