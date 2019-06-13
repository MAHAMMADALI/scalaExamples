package assignments.strings

class Employee(val empID:Int, empName: String, empSalary: Float) {
  var employeeId = empID
  var employeeName = empName
  var employeeSalary = empSalary
  print(s"Employee Details from outside method: Name: $employeeName Salary: $employeeSalary,  EmpID: $employeeId")

  def hikeSalary(percent: Float) {
    employeeSalary = employeeSalary + (employeeSalary * percent)
    println("----- From hikeSalary method -----")
    println("EmpID: " + employeeId)
    println("EmpName: " + employeeName)
    println("EmpSal: " + employeeSalary)
      }

  object Demo {
    def main(args: Array[String]): Unit = {
      val emp = new Employee(101, "suraz", 5000f)
      emp.hikeSalary(0.20f)
    }

  }


}