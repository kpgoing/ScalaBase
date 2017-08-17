package example

import java.util.{Date, Locale}
import java.text.DateFormat._

/**
  * @author zhisheng 
  *
  **/
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.CHINESE)
    println(df format now)
  }
}