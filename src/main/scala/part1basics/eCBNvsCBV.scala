package part1basics

object eCBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())
  // System.nanoTime() is evaluated every time. Called by name bu demek.
  // O yüzden 2 farklı nanotime yazıyor.
  /*
  by value: 1257387745764245
  by value: 1257387745764245
  by name: 579504853189833
  by name: 579504853210000
   */

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34) // stack overflow
  printFirst(34, infinite())
}
