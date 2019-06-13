/**
  * Given a string, return a new string where "not " has been added to the front. However,
  * if the string already begins with "not", return the string unchanged.
  * Note: use .equals() to compare 2 strings.
  * Expected	Run
  * notString("candy") → "not candy"	"not candy"	OK
  * notString("x") → "not x"	"not x"	OK
  * notString("not bad") → "not bad"	"not bad"	OK
  * notString("bad") → "not bad"	"not bad"	OK
  * notString("not") → "not"	"not"	OK
  * notString("is not") → "not is not"	"not is not"	OK
  * notString("no") → "not no"	"not no"	OK
  */
package javaPrograms.Warmup1
object NotString {
  def notString(str: String): String = {
    if (str.length >= 3 && str.substring(0, 3) == "not") return str
    "not " + str
  }

}
