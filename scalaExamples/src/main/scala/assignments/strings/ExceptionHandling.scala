package assignments.strings
import scala.util.{Try, Success, Failure}

object ExceptionHandling {

  def main(args: Array[String]): Unit = {
    val result = divide(10, 0)
    //println(result.get) //abnormal termination
    result match {
      case Success(output) => println(output)
      case Failure(error) => handleException(error)
    }
    println("Process ends")
  }

  def divide(num1: Int, num2: Int): Try[Int] ={
    Try(process(num1, num2))
  }
  def process(num1: Int, num2: Int):Int={
    num1/num2
  }
  def handleException(throwable: Throwable):Unit={
    println(s"Some Exception occured $throwable")
  }
}  /*Some Exception occured java.lang.ArithmeticException: / by zero
Process ends*/