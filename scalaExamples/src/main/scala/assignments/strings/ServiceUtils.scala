package assignments.strings

class AgeException(s:String) extends Exception(s){}
case class Employee1 (val name:String, val totalExp: Int, val salary:Float)
object ServiceUtils {
  @throws(classOf[AgeException])
  def validateTotalExpForVisa(yearsOfExp: Int): String={
    if(yearsOfExp < 4){
      throw new AgeException(s"please try after ${4 - yearsOfExp} years")
    }else{ "Eligible"}
  }
}
object CustomException{
  def main(args: Array[String]): Unit = {
    val empList = getEmpList
    val result = empList.map{ emp => {
      try{
        val result = ServiceUtils.validateTotalExpForVisa(emp.totalExp)
        (emp.name, result)
      } catch {
        case e: AgeException => {
          println(s"Exception occured: ${e}")
          (emp.name, e.getMessage)
        }
      }
    }}
    result.foreach( println)
  }
  private def getEmpList ={
    val emp1 = Employee1("Suraj", 8, 5000)
    val emp2 = Employee1("Kiran", 3, 8000)
    List(emp1, emp2)
  }
} /* Exception occured: assignments.strings.AgeException: please try after 1 years
(Suraj,Eligible)
(Kiran,please try after 1 years) */
