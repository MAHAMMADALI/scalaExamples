package javaPrograms.Warmup1


object MonkeyTroubleScala1 {
    def main(args: Array[String]): Unit = {

      def monkeyTrouble(aSmile: Boolean, bSmile: Boolean): Boolean = {
        if (aSmile && bSmile) return true
        if (!aSmile && !bSmile) return true
        false
      }
      println(monkeyTrouble(false,true))
    }

}
