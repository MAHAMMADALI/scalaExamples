package assignments.strings

import scala.io.Source
import scala.collection.mutable.ListBuffer

object Demo{
  def readTextFile(filename: String):Option[List[String]] = {
    try{
      var content = ListBuffer[String]()
      for(line <- Source.fromFile(filename).getLines){
        content += line
      }
      Some(content.toList)
    }catch { case e: Exception => None }
  }
  def main(args: Array[String]): Unit = {
    val content = readTextFile("F:\\links.txt")
    val contentList=content.get
    content.foreach{lines => lines.foreach(println)}
  }
}