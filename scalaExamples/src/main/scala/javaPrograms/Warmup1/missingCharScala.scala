/**
  * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
  * The value of n will be a valid index of a char in the original string
  * (i.e. n will be in the range 0..str.length()-1 inclusive).
  * missingChar("kitten", 1) → "ktten"
  * missingChar("kitten", 0) → "itten"
  * missingChar("kitten", 4) → "kittn"
  */
package javaPrograms.Warmup1

object missingCharScala {
  def main(args: Array[String]): Unit = {
    print(missingChar("String", 3))

  }

  def missingChar(str: String, n: Int): String = {
    val front = str.substring(0, n)
    val back = str.substring(n + 1, str.length)
    front + back
  }
}
