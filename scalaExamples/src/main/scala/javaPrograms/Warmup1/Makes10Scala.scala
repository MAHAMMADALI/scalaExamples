/**
  * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
  *             Expected	Run
  * makes10(9, 10) → true	true	OK
  * makes10(9, 9) → false	false	OK
  * makes10(1, 9) → true	true	OK
  * makes10(10, 1) → true	true	OK
  * makes10(10, 10) → true	true	OK
  * makes10(8, 2) → true	true	OK
  * makes10(8, 3) → false	false	OK
  * makes10(10, 42) → true	true	OK
  * makes10(12, -2) → true	true	OK
  */
package javaPrograms.Warmup1

object Makes10Scala {

  def makes10(a: Int, b: Int): Boolean = (a + b == 10) || (a == 10 || b == 10)
}
