import java.io.{FileNotFoundException, FileOutputStream, IOException}

import org.apache.poi.ss.usermodel.{Cell, Row}
import org.apache.poi.xssf.usermodel.{XSSFSheet, XSSFWorkbook}

object ApachePOIExcelWriteScala {
  private val FILE_NAME = "F:/GSTReport.xlsx"

  def main(args: Array[String]): Unit = {
    val workbook = new XSSFWorkbook
    val sheet = workbook.createSheet("Datatypes in Java")
    val datatypes = Array(Array("Datatype", "Type", "Size(in bytes)"), Array("int", "Primitive", 2), Array("float", "Primitive", 4), Array("double", "Primitive", 8), Array("char", "Primitive", 1), Array("String", "Non-Primitive", "No fixed size"))
    var rowNum = 0
    System.out.println("Creating excel")
    for (datatype <- datatypes) {
      rowNum = rowNum + 1
      val row = sheet.createRow(rowNum)
      var colNum = 0
      for (field <- datatype) {
        colNum = colNum+1
        val cell = row.createCell(colNum)
        if (field.isInstanceOf[String]) cell.setCellValue(field.toString)
        else if (field.isInstanceOf[Integer]) cell.setCellValue(field.toString)


      }
    }
    try {
      val outputStream = new FileOutputStream(FILE_NAME)
      workbook.write(outputStream)
      workbook.close()
    } catch {
      case e: FileNotFoundException =>
        e.printStackTrace()
      case e: IOException =>
        e.printStackTrace()
    }
    System.out.println("Done")
  }
}