package part1basics

object bExpressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(x == 1)
  // == != > >= < <=

  println(!(x == 1))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // IF Expression
  println(aConditionValue)
  println(if (aCondition) 5 else 3)

  // Aşağıdaki gibi imperative yazma;
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // bir şey return etmeyince Unit oluyor, void gibi düşün.
  val aWeirid: Unit = (aVariable = 3)

  val aCodeBlock = { // inline tanım, scope mantığı aynı, bu bir expression VE string return ediyor.
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // code blockta, last expression hesaplanır her zaman
  val bCodeBlock = {
    if (aVariable < 3) true else false
    42
  }
  println(bCodeBlock)
}
