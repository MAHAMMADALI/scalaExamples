package javaPrograms.Warmup1

object Close10Scala {

  def close10(a: Int, b: Int): Int = {
    val aDiff = Math.abs(a - 10)
    val bDiff = Math.abs(b - 10)
    if (aDiff < bDiff) return a
    if (bDiff < aDiff) return b
    0 // i.e. aDiff == bDiff

  }

}
