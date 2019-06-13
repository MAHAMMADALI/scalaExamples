/**
  * Given a string, return a new string where the first and last chars have been exchanged.
  * frontBack("code") → "eodc"
  * frontBack("a") → "a"
  * frontBack("ab") → "ba"
  */
package javaPrograms.Warmup1

object FrontBackScala {

  def frontBack(str: String): String = {
    if (str.length <= 1) return str
    val mid = str.substring(1, str.length - 1)
    str.charAt(str.length - 1) + mid + str.charAt(0)
  }

  def main(args: Array[String]): Unit = {
    print(frontBack("Talakona"))
  }
}
