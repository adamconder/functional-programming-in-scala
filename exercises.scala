package exercises

//Exercise 2:

// 2.1 fibonnaci

// def fib(first: Int, second: Int) : Int = {

// 	def go(n: Int, p: Int, b: Int) : Int = {
// 		go(n+)
// 	}

// 	go(first+second, first, second) // gives 1
// }

// fib(0, 1)

// def fib(n : Int) : Int = {
// 	if (n <= 1) n
// 	else fib(n-1) + fib(n-2)
// }

object Exercise1 {
    def fib(n : Int) : Int = {

      def loop(n: Int, previous: Int, current: Int) : Int = {
        if (n == 0) previous
        else loop(n - 1, current, previous + current)
      }

      loop(n, 0, 1)
    }

    // 10, 0, 1
    // 9, 1, 1
    // 8, 1, 2
    // 7, 2, 3
}

// Exercise 2.2
object User {

  def sortUsers = {

    //  val users = Array("a", "b", "c", "d", "z", "p", "r")
    val usersUnsorted = Array(1, 2, 4, 8, 3, 5, 5)
    val usersSorted = Array(1, 2, 3, 4, 5, 6, 7, 8)

    def descending(x : Int, y : Int) = x > y

    val unsorted = isSorted(usersUnsorted, descending)
    println(unsorted)

    val sorted = isSorted(usersSorted, descending)
    println(sorted)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) : Boolean = {

    // check current iteration character and the previous one
    def loop(i: Int, prev: A) : Boolean = {
      // safeguard out of bounds error
      if (i == as.length) true // is fully sorted
      // check if the current item and the previous item are greater than then loop again over the next index
      else if (ordered(as(i), prev)) loop(i + 1, as(i))
      else false
    }

    if (as.length == 0) true
    else loop(1, as(0))
  }

}