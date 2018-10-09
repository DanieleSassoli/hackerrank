/*
  https://www.hackerrank.com/challenges/string-mingling/problem
 */

object StringMingling {
  def main(args: Array[String]): Unit = {
    val p = scala.io.StdIn.readLine()
    val q = scala.io.StdIn.readLine()
    println(p.zip(q).flatMap(x => List(x._1, x._2)).mkString(""))
  }
}
