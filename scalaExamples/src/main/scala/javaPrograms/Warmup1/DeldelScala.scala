/**
  * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
  *
  * delDel("adelbc") → "abc"
  * delDel("adelHello") → "aHello"
  * delDel("adedbc") → "adedbc"
  */
package javaPrograms.Warmup1

object DeldelScala {

  def delDel(str: String): String = {
    if (str.length >= 4 && str.substring(1, 4) == "del") return str.substring(0, 1) + str.substring(4)
    str
  }

}
