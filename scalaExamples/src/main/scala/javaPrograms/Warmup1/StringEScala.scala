/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
package javaPrograms.Warmup1

object StringEScala {
  def stringE(str: String): Boolean = {
    var count = 0
    var i = 0
    while ( {
      i < str.length
    }) {
      if (str.charAt(i) == 'e') {
        count += 1; count - 1
      }

      {
        i += 1; i - 1
      }
    }
    if (count >= 1 && count <= 3) return true
    false
  }
}
