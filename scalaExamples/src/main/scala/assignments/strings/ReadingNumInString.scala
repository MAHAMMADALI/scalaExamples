/** read a string and just collect all the numbers
  * Hint: try reading them byte wise and read the  ASCII of numbers and filter them
  * ex: Hello4World23=>423
  * ASCII values of:
  * [a-z] = [97-122]
  * [A-Z] = [65-90]
  * Special chars: [0-47 & 58-64]  **/
package assignments.strings
object ReadingNumInString {

  def readingNumInString(msg: String): String = {
    val n = msg.length
    var str = ""
   for (i <- 0 until n) {
      if (!(msg.charAt(i) >= 97 && msg.charAt(i) <= 122) &&
          !(msg.charAt(i) >= 65 && msg.charAt(i) <= 90) &&
          !(msg.charAt(i) >= 0 && msg.charAt(i) <= 47) &&
          !(msg.charAt(i) >= 58 && msg.charAt(i) <= 64)) str = str + msg.charAt(i)
    }
    str
    
  }
  def main(args: Array[String]): Unit = {
    println(s"case convert of string H(e12llo : ${readingNumInString("H(e12ll6o")}")
    println(s"case convert of string 56a,bc : ${readingNumInString("56a,bc")}")
    println(s"case convert of string DEF16 : ${readingNumInString("DE**45**F16")}")
    println(s"case convert of string 3ghi- : ${readingNumInString("3ghi-")}")
    println(s"case convert of string 1$$23%45 : ${readingNumInString("1$23%45")}")
  }
}
  
