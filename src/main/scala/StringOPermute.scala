object StringOPermute {
  def main(args: Array[String]): Unit = {
    val numStrings = scala.io.StdIn.readInt()
    1 to numStrings foreach { _ =>
      val str = scala.io.StdIn.readLine()
      println(str.toList.grouped(2).flatMap { x =>
        List(x.last, x.head)
      }.mkString(""))
    }
  }
}
