/**
  * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
  *               Expected	Run
  * nearHundred(93) → true	true	OK
  * nearHundred(90) → true	true	OK
  * nearHundred(89) → false	false	OK
  * nearHundred(110) → true	true	OK
  * nearHundred(111) → false	false	OK
  * nearHundred(121) → false	false	OK
  * nearHundred(-101) → false	false	OK
  * nearHundred(-209) → false	false	OK
  * nearHundred(190) → true	true	OK
  * nearHundred(209) → true	true	OK
  * nearHundred(0) → false	false	OK
  * nearHundred(5) → false	false	OK
  * nearHundred(-50) → false	false	OK
  * nearHundred(191) → true	true	OK
  * nearHundred(189) → false	false	OK
  * nearHundred(200) → true	true	OK
  * nearHundred(210) → true	true	OK
  * nearHundred(211) → false	false	OK
  * nearHundred(290) → false	false	OK
  */
package javaPrograms.Warmup1

object NearHundredScala {

  def nearHundred(n: Int): Boolean = Math.abs(100 - n) <= 10 || (Math.abs(200 - n) <= 10)

}
