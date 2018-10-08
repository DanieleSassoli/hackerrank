/*
bit of a different implementation of fibonacci.
I'm inserting elements at the beginning of the list instead than appending them at the end.
I'm then adding the first 2 elements so that I don't have to traverse the whole list to get the last 2 items.
 */

object Fibonacci {
  def fibonacci(x: Int): Int = {
    def go(l: List[Int]): Int = {
      if (l.length == x) l.head
      else go(l.take(2).sum :: l)
    }
    go(List(1, 0))
  }
  println(fibonacci(2))
}