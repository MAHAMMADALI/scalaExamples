
import java.io.File
import java.util
import java.util.{ArrayList, List}
import invoice.FilesDirs

import scala.collection.mutable.ListBuffer


class ListFilesDirs {

 /* def getDirs(path: String): ListBuffer[String] = {
    var dirList: ListBuffer[String] = new ListBuffer[String]
    val file = new File(path)
    val fList = file.listFiles()
    if (fList != null) {
      for (file: File <- fList) {
        if (file.isDirectory()) dirList.append(file.getName)
      }
    }
    dirList
  }*/

  //def getFileList(dirList:ListBuffer[String], path:String, )={
  def getFiles(path: String, fileList: ListBuffer[File]): Unit = {

    val directory: File = new File(path)
    var fList = directory.listFiles()
    if (fList != 0) for (file: File <- fList) {
      if (file.isFile) fileList.append(file)
      else if (file.isDirectory) {
        getFiles(file.getAbsolutePath, fileList)
      }
    }
  } //ListBuffer(F:\invoice_Report\monthWise\Aug-2018\Suraj Ghimire_00001_part1_1-Aug-2018_5000.pdf, F:\invoice_Report\monthWise\Dec-2018\Karan Kumar_00002_part3_1-Dec-2018_2000.pdf, F:\invoice_Report\monthWise\Jan-2019\Karan Kumar_00002_part4_1-Jan-2019_1000.pdf, F:\invoice_Report\monthWise\Jan-2019\Karan Kumar_00002_part5_1-Jan-2019_1000.pdf, F:\invoice_Report\monthWise\Oct-2018\Karan Kumar_00002_part1_1-Oct-2018_2000.pdf, F:\invoice_Report\monthWise\Oct-2018\Karan Kumar_00002_part2_31-Oct-2018_2000.pdf, F:\invoice_Report\monthWise\Oct-2018\Suraj Ghimire_00001_part3_1-Oct-2018_8000.pdf, F:\invoice_Report\monthWise\Sep-2018\Suraj Ghimire_00001_part2_1-Sep-2018_7000.pdf)
}




