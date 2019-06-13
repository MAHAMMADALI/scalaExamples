package assignments.strings

object StringACIISum {

  val nameList = List( "oi", "Isha", "Tom", "HELLO", "hello","Shaik")
  val nameList1 = List( "123", "456", "789")

  def findGreatestByUnicode(namedList: List[String]):String={

    namedList.reduceLeft( (name1,name2) => {
      println(s"current strings to compir are: ${name1} , ${name2}")
      if( sumACCII(name1) > sumACCII(name2) )
        name1
      else name2
    })
  }

  def sumACCII(name:String):(Int)={
    var summsg=0
    for(i <- 0 until  name.length){

      summsg=summsg+name.charAt(i)
    }
    (summsg)
  }

  def main(args: Array[String]): Unit = {
    print(findGreatestByUnicode(nameList))
  }
}
