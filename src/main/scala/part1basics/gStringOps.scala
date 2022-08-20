package part1basics

object gStringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z') // prepend append adding
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators.

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  // 2 characters total, 2 decimal precisions 1.20
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline") // \n göremezsin.

  // istisna case'i
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
