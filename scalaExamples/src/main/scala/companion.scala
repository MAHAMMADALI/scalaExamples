class Companion {
  private var num1 = 10
  def print(): Unit ={
    println(s"From Companion class num1=${num1} num2=${Companion.num2}")
  }
}
object Companion{
  var num2 = 20

  def main(args: Array[String]): Unit = {
    var obj = new Companion
    obj.print()
    println(s"From companion Object num1=${obj.num1} num2=${num2}")
  }

  //From Companion class num1=10 num2=20
  //From companion Object num1=10 num2=20
}
