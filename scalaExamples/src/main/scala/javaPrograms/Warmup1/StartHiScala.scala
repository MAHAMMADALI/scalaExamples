/**
  * Given a string, return true if the string starts with "hi" and false otherwise.
  *
  * startHi("hi there") → true
  * startHi("hi") → true
  * startHi("hello hi") → false
  */
package javaPrograms.Warmup1

object StartHiScala {

  def startHi(str:String):Boolean={
    if ( str.length() < 2) false
    var front2 = str.substring(0,2)
    if(front2.equals("hi")) true
    else false
  }


  /*def startHi(str: String): Boolean = {
    if (str.length < 2) return false
    val f2 = str.substring(0, 2)
    if (f2 == "hi") true
    else false
  }*/
}
