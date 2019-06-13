/*
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
ront3("ab") → "ababab"
front3("a") → "aaa"
front3("") → ""
 */

package javaPrograms.Warmup1

object Front3Scala {

  def front3(str: String):String={
    var front = str
    if( str.length() >= 3){ front= str.substring(0,3)}
    else { front = str}
    return front+front+front
  }

  def main(args: Array[String]): Unit = {
    println(front3("String"))
    println(front3("jd"))
  }
}
