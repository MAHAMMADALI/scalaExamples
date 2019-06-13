/**
  * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
  * so "kitten" yields"kikittenki".
  * If the string length is less than 2, use whatever chars are there.
  *
  * front22("kitten") → "kikittenki"
  * front22("Ha") → "HaHaHa"
  * front22("abc") → "ababcab"
  */
package javaPrograms.Warmup1

object Front2 {

  def front22(str: String): String = if (str.length <= 2) str + str + str
  else {
    val front = str.substring(0, 2)
    front + str + front
  }
}
