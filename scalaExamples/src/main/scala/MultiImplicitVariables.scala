object MultiImplicitVariables {

  def main(args: Array[String]): Unit = {
    val num1 = 5
    val num2 = 10

    implicit val dbConnection = "DB"
    implicit val salary:Double = 50000

    println ( s"Sum method retruns ${sum(5, 10)}")
    println ( s"Mul method retruns ${mul(5,10)}")
    println ( s"SQ method retruns ${sq}")
  }
  def sum(num1: Int, num2: Int)(implicit dbConn:String)={
    println(s"$num1 , $num2 , $dbConn")
    num1+num2
  }
  def mul(num1: Int, num2:Int)(implicit dbConn:String, salary:Double)={
    println(s"$num1, $num2 , $dbConn , $salary")
  }
  def sq(implicit dbConn:String, salary:Double)={
    println(s"$dbConn $salary")
    salary * salary
  }
}
