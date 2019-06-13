/**
  * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
  * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
  *
  * sleepIn(false, false) → true
  * sleepIn(true, false) → false
  * sleepIn(false, true) → true
  */
package javaPrograms.Warmup1

object SleepInScala {
  def sleep(weekday: Boolean, vacation: Boolean): Boolean = {
    if (!weekday || vacation) return true
    false
  }

}
