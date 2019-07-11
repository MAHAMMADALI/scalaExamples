object LinearSearch{
  def main(args:Array[String]):Unit={
    val arr = Array(3,4,5,11,23,17,21)
    val pos = search(arr,17)
    pos match{
      case -1 => println("Element not Found")
      case p => println(s"Element Found at Inde $p")
    }
  }
  def search(arr:Array[Int], element:Int):Int={
    for(i <- 0 until arr.length){
      println(s"i = $i")
      if(arr(i) == element){
        return i
      }
    }
    println("Not Found")
    -1
  }
}