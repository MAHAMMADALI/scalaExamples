/**
  * Return true if the given non-negative number is a multiple of 3 or a multiple of 5
  * or35(3) → true
  * or35(10) → true
  * or35(8) → false
  */
package javaPrograms.Warmup1

object Or35 {
  def or35(n :Int):Boolean={
    (n % 3 == 0 || n % 5 == 0)

  }

  def main(args: Array[String]): Unit = {
    println(or35(8))
  }
}
