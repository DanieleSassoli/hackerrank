object Utils {
  def readPairs(n: Int): List[(Int, Int)] = {
    1 to n map { _: Int =>
      val pattern = "(\\d*)\\s(\\d*)".r
      val input = scala.io.StdIn.readLine()
      val vals = pattern.findFirstMatchIn(input).get
      (vals.group(1).toInt, vals.group(2).toInt)
    }
  }.toList

  def readInt: Int = {
    scala.io.StdIn.readInt()
  }

  def readLine: String = {
    scala.io.StdIn.readLine()
  }
}