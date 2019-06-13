/**
  * Given two int values, return their sum.
  * Unless the two values are the same, then return double their sum.
  * sumDouble(1, 2) → 3
  * sumDouble(3, 2) → 5
  * sumDouble(2, 2) → 8
  */
package javaPrograms.Warmup1

object SumDoubleScala {
  def sumDouble(a: Int, b: Int): Int = {
    if (a != b) return a + b
    (a + b) * 2
  }

}
