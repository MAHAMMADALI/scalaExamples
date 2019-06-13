/**
  * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
  *
  * backAround("cat") → "tcatt"
  * backAround("Hello") → "oHelloo"
  * backAround("a") → "aaa"
  */
package javaPrograms.Warmup1

object BackAroundScala {

  def backAround(str: String): String = {
    val n = str.length
    val last = str.charAt(n - 1)
    if (n > 1) return last + str + last
    str + str + str
  }

  def main(args: Array[String]): Unit = {
    println(backAround("String"))
    println(backAround("s"))
    println("")
  }
}
