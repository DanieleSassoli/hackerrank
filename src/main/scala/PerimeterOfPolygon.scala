/*
  https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem
 */

object PerimeterOfPolygon {

  def perimeter(points: List[(Int, Int)]): BigDecimal = {
    points.tail.foldLeft(points.head, 0d){
      case ((pointA, tmpPerimeter), pointB) =>
        (pointB, tmpPerimeter + lengthOfEdge(pointA, pointB))
    }._2 + lengthOfEdge(points.head, points.last)
  }

  def lengthOfEdge(pointA: (Int, Int), pointB: (Int, Int)): Double = {
    Math.sqrt(Math.pow(pointB._1 - pointA._1, 2) + Math.pow(pointB._2 - pointA._2, 2))
  }

  def main(args: Array[String]): Unit = {
    val numPoints = scala.io.StdIn.readInt()
    println(perimeter(Utils.readPairs(numPoints)))
  }
}
