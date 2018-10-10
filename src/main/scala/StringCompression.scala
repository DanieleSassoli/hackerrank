/*
Excerise can be found at https://www.hackerrank.com/challenges/string-compression/problem
 */
object StringCompression {
  def main(args: Array[String]): Unit = {
    val str = scala.io.StdIn.readLine().toList
    println(encode(str).mkString(""))
  }

  def pack[T](ls: List[T]): List[List[T]] = {
    ls match {
      case Nil => Nil
      case _ =>
        val (packed, next) = ls span {
          _ == ls.head
        }
        packed :: pack(next)
    }
  }

  def encode[T](ls: List[T]): List[String] = {
    ls match {
      case Nil => Nil
      case _ =>
        val (packed, next) = ls span {
          _ == ls.head
        }
        s"${packed.head}${packed.length}" :: encode(next)
    }
  }
}
