import java.io.{FileNotFoundException, FileOutputStream, IOException}
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import scala.collection.mutable.ListBuffer
import scalaInvoice.GstData

class Dummy {

  def writeGSTDataToXLSFile(data:ListBuffer[ListBuffer[GstData]])={
    try {
    var month = ""
    for(i <- 0 until data.size){
      val workbook = new XSSFWorkbook
      val sheet = workbook.createSheet("MonthlyGSTReport")
      var rowNum = 0 ; var colNum = 0
      for(j <- 0 until data(i).size){
        month = s"${data(i)(j).invoiceDate.split("-")(1)}-${data(i)(j).invoiceDate.split("-")(2)}"
        val row = sheet.createRow(j)
        val itr = data(i)(j).productIterator
        var array = itr.toArray
        for(t <- 0 until array.size) {
          val cell = row.createCell(t)
          cell.setCellValue(array(t).toString)
          } //updates each Cell of the Row
       }// update and Increment Rows
        rowNum = rowNum+1

      val outputStream = new FileOutputStream(s"F:\\MonthlyGSTReport-${month}.xlsx")
      workbook.write(outputStream)
      workbook.close()
    } // Create new WorkSheet of the month
    }catch {
      case e: FileNotFoundException =>
        e.printStackTrace()
      case e: IOException =>
        e.printStackTrace()
    }
  }


}
