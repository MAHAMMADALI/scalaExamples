class Demo {
  var num1=0
  var num2=0
  private var num3=0
  var result =0
  def add(n:Int):Int= num1+num2+n
  def mul(num1:Int, num2:Int): Unit ={
    result = num1 * num2
  }
}
object Demo {
  def main(args: Array[String]): Unit = {
    var d = new Demo
    d.mul(2, 4)
    println(d.result)
  }

}
