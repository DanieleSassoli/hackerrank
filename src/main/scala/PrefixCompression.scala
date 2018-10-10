/*
  Excercise can be found at https://www.hackerrank.com/challenges/prefix-compression/problem
 */
object PrefixCompression {
  def main(args: Array[String]): Unit = {
    val str1 = scala.io.StdIn.readLine().toList
    val str2 = scala.io.StdIn.readLine().toList
    val commonPrefixLength = (str1 zip str2).takeWhile{ case (a, b) => a == b }.length
    println(s"$commonPrefixLength ${str1.take(commonPrefixLength).mkString("")}")
    println(s"${str1.length - commonPrefixLength} ${str1.drop(commonPrefixLength).mkString("")}")
    println(s"${str2.length - commonPrefixLength} ${str2.drop(commonPrefixLength).mkString("")}")
  }
}
