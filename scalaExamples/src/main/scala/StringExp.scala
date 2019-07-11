object StringExp {

  def main(args: Array[String]): Unit = {

    var msg = """#
    #This
        #is
#a         Multi
#Line
            #String"""
    println(msg)
    println("-----------------------")
    println(msg.stripMargin('#'))
  }

}
