/*
  https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem
 */

object AreaOfPolygon {

  def area(pairs: List[(Int, Int)]): BigDecimal = {
    val c = pairs.tail.foldLeft((pairs.head, 0)) {
      case (((prevX, prevY), acc), (curX, curY)) => ((curX, curY), acc + prevX * curY - prevY * curX)
    }
    val (firstX, firstY) = pairs.head
    val (lastX, lastY) = c._1
    BigDecimal((c._2 + (lastX * firstY) - (lastY * firstX)).toDouble / 2d).setScale(1)
  }

  def main(args: Array[String]): Unit = {
    val numPoints = scala.io.StdIn.readInt()
    println(area(Utils.readPairs(numPoints)))
  }
}
