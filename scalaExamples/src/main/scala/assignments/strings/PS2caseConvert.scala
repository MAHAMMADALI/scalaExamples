/**Read a string and convert al uppercase to lowercase and vice-versa
ex: HelloWorld => hELLOwORLD
ASCII values of
[a-z] = [97-122]
[A-Z] = [65-90]
Special chars: [0-47 & 58-64]    */

package assignments.strings
object PS2caseConvert {

  def main(args: Array[String]): Unit = {
    println( s"case convert of string Hello : ${caseConvert( "He12llo")}")
    println( s"case convert of string abc : ${caseConvert( "56abc")}")
    println( s"case convert of string DEF16 : ${caseConvert( "DEF16")}")
    println( s"case convert of string ghi# : ${caseConvert( "ghi#")}")
    println( s"case convert of empty string  : ${caseConvert( "12345")}")
  }
  def caseConvert(msg:String):String={
    val n = msg.length
    var str = ""
    for ( i <- 0 until n ){
      if(msg.charAt(i)>=97 && msg.charAt(i)<=122) {str = str+msg.charAt(i).toUpper}
      else if(msg.charAt(i)>=65 && msg.charAt(i)<=90) {str = str+msg.charAt(i).toLower}
      else str=str+msg.charAt(i)
    }
    str
  }
}
