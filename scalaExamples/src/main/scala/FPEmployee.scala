import java.util
case class Employee(empName:String, empDept:String, empDesignation:String, empSalary:Float)
object FPEmployee {
  val empDetails = new util.ArrayList[Employee]
  def main(args: Array[String]): Unit = {
    val rajEmp = Employee("Raj", "IT", "CSE",	1000f);           empDetails.add(rajEmp)
    val anilEmp = Employee("Anil", "IT", "SE", 5000f);          empDetails.add(anilEmp)
    val binduEmp = Employee("Bindu", "Mgmt", "MGR", 10000f);    empDetails.add(binduEmp)
    val chiruEmp = Employee("Chiru", "IT", "TL", 2000f);        empDetails.add(chiruEmp)
    val hemanthEmp = Employee("Hemanth", "Mgmt", "HR", 3000f);  empDetails.add(hemanthEmp)
    val mithunEmp = Employee("Mithun", "IT", "SE" ,8000f);      empDetails.add(mithunEmp)
    val salmanEmp = Employee("Salman", "Mgmt", "HR", 5000f);    empDetails.add(salmanEmp)
    val nagEmp = Employee("Nag", "IT", "CSE", 4000f);           empDetails.add(nagEmp)
    val parthaEmp = Employee("Partha", "Mgmt", "MGR", 20000f);  empDetails.add(parthaEmp)

    val itr = empDetails.listIterator
    while (itr.hasNext){ println(empHikeProcess(itr.next))  }
  }
  val empHikeProcess = new PartialFunction[Employee, String] {
    override def isDefinedAt(emp: Employee): Boolean = { emp.empSalary > 0 }
    override def apply(emp:Employee): String = {
      val empIT:String = emp.empDept
      val empDesignation:String = emp.empDesignation
      val empDept:String = emp.empDept
      val empSal:Float = emp.empSalary
      if((empIT == "IT" && empDesignation == "CSE") || (empDept=="Mgmt" && empDesignation=="MGR")) s"No Hike for Employee ${emp.empName} As there Designation is : ${empDesignation} with Dept ${empDept}"
      else if (empDept == "IT" && empDesignation=="SE") s"Revised Salary post hike for Employee ${emp.empName} is : ${((emp.empSalary * 0.1) + emp.empSalary)}"
      else if (empDept == "IT" && empDesignation=="TL") s"Revised Salary post hike for Employee ${emp.empName} is : ${((emp.empSalary * 0.05) + emp.empSalary)}"
      else if (empDept == "IT" && empDesignation=="MGR") s"Revised Salary post hike for Employee ${emp.empName} is : ${((emp.empSalary * 0.02) + emp.empSalary)}"
      else s"Revised Salary post hike for Employee ${emp.empName} is : ${((emp.empSalary * 0.03) + emp.empSalary).toFloat}"
    }
  }
}
