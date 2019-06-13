/**
  * Given 2 int values, return true if one is negative and one is positive.
  * Except if the parameter "negative" is true, then return true only if both are negative.
  *                   Expected	Run
  * posNeg(1, -1, false) → true	true	OK
  * posNeg(-1, 1, false) → true	true	OK
  * posNeg(-4, -5, true) → true	true	OK
  * posNeg(-4, -5, false) → false	false	OK
  * posNeg(-4, 5, false) → true	true	OK
  * posNeg(-4, 5, true) → false	false	OK
  * posNeg(1, 1, false) → false	false	OK
  * posNeg(-1, -1, false) → false	false	OK
  * posNeg(1, -1, true) → false	false	OK
  * posNeg(-1, 1, true) → false	false	OK
  * posNeg(1, 1, true) → false	false	OK
  * posNeg(-1, -1, true) → true	true	OK
  */
package javaPrograms.Warmup1

object PosNegScala {

  def posNeg(a: Int, b: Int, negative: Boolean): Boolean = if (negative) a < 0 && b < 0
  else (a < 0 && b > 0) || (a > 0 && b < 0)

}
