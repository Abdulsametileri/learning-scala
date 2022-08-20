package part1basics

object cFunctions extends App {
  def aFunction(a: String, b: Int): String = a + " " + b // one-line

  def bFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParamaterlessFunction(): Int = 42

  println(aParamaterlessFunction()) // 42
  println(aParamaterlessFunction) // 42

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3)) //hellohellohello

  // WHEN YOU USE LOOPS, USE RECURSION!

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("huhu")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }


  def greetingFunction(name: String, age: String): String = {
    s"Hi my name is $name and I am $age years old"
  }
  println(greetingFunction("Samet", "26"))

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(5))


  def fibonacci(n: Int): Int = {
    if (n == 1) 1
    else if (n == 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(4))
}
