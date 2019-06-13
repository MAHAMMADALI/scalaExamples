/**Write a function that takes an int and return you 5 characters String:
  Note: use fill Strings concept.
example: "Hello"*3+"world"
123(Int)-> 00123(String)
1 	-> 00001
12345	-> 12345
123456	-> 12345
0	-> 00000
-ve num	-> 00000
**/
package assignments.strings

object PS1StringFilling {
  def leftPad(num: Int, limitTo: Int): String = {
    var strNum = num.toString
    if (num < 0) strNum = "0"
    else if (num.toString.length > limitTo)
      strNum = num.toString.substring(0, limitTo)
      "0" * (limitTo - strNum.length) + strNum
  }
  def main(args: Array[String]): Unit = {
    println("leftPad(123, 5):" + leftPad(123, 5))
    println("leftPad(1, 5):" + leftPad(1, 5));
    println("leftPad(12345, 5):" + leftPad(12345, 5))
    println("leftPad(123456, 5):" + leftPad(123456, 5))
    println("leftPad(0, 5):" + leftPad(0, 5))
    println("leftPad(-123, 5):" + leftPad(-123, 5))
  }
}

  /*O/p:     leftPad(123, 5):00123
  leftPad(1, 5):00001
  leftPad(12345, 5):12345
  leftPad(123456, 5):12345
  leftPad(0, 5):00000
  leftPad(-123, 5):00000
*/

