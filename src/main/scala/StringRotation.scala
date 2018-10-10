/*
  Excercise can be found at https://www.hackerrank.com/challenges/rotate-string/problem
 */
object StringRotation {

  def rotate(s: String): List[String] = {
    def go(str: String, acc: List[String]): List[String] = {
      val newStr = str.tail + str.head
      if(acc.length == s.length) acc
      else go(newStr, acc ++ List(newStr))
    }
    go(s, List())
  }
  def main(args: Array[String]): Unit = {
    val numTestCases = Utils.readInt
    1 to numTestCases foreach { _ =>
      println(rotate(Utils.readLine).mkString(" "))
    }
  }
}
