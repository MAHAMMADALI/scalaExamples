package assignments.strings

import java.io.{File, FileNotFoundException, FileReader, IOException}
import java.lang

object ExceptionHadling1 {

  def main(args: Array[String]): Unit = {
    println("Program Begins")

    try{
      process("4")
      println("Process is Completed")
    }catch {
      case ae: ArithmeticException => println("Cannot divide by zero")
      case aiobe: ArrayIndexOutOfBoundsException => {println(" you can't access element that dosen't exist")}
      case cnf: ClassNotFoundException => println(s"cann't found the class ${cnf.printStackTrace()}")
      case fnf: FileNotFoundException => println(s"unable to locate the file ${fnf}")
      case _: Exception => { println("Some other exception")}
    } finally { println("This is finally block")}
    println("Program Ends here")
  }
  def handleFileNotFound(fnfe: ClassNotFoundException):Unit={ println(s"class not found $fnfe")}
  def process(msg: String):Unit = {
    if(msg.equals("1")){
      val result=5/0 //AE
    }
    else if(msg.equals("2")){
      val arr=Array(5)
      println(arr(10))  //AIOBE
    }
    else if(msg.equals("3")){
      Class.forName("Test123") //CNFE
    }
    else if(msg.equals("4")){
      val f = new File("abc.txt")
      val v = new FileReader(f) //FNFE
    } else println("Successfull")
  }
}
/*Program Begins
unable to locate the file
This is finally block
Program Ends here */
