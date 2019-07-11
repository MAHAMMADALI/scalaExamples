object Fibonacci{
  def main(args: Array[String]): Unit = {
    val result = getFibonacci(10)
    println(result)
  }
 // def fib(n: Int):Int = if(n > 1) fib(n-1) + fib(n-2) ;  else n

  def getFibonacci(index: Int): Int = {
    @annotation.tailrec
    def getTailRec(index: Int, prev: Int, current: Int): Int = {
      if (index <= 0) {
        current
      } else {
        getTailRec(index - 1, prev = prev + current, current = prev)
      }
    }

    getTailRec(index, prev = 1, current = 0)
  }

}//55
