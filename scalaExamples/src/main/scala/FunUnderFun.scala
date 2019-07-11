object FunUnderFun{
  def main(args: Array[String]): Unit = {
    val result = fib(10)
    println(result)
  }
  def fib(n: Int):Int = if(n > 1) fib(n-1) + fib(n-2)
  else n
}//55
