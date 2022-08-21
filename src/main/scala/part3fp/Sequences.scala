package part3fp

object Sequences extends App {
  val aSequence = Seq(1, 2, 3, 4)
  println(aSequence) // List(1, 2, 3, 4)
  println(aSequence.reverse) // List(4, 3, 2, 1)
  println(aSequence(2)) // 3
  println(aSequence ++ Seq(5, 6, 7)) // List(1, 2, 3, 4, 5, 6, 7)
  println(aSequence.sorted) // List(1, 2, 3, 4)

  val aRange: Seq[Int] = 1 to 10 // to -> inclusive; to -> exclusive (10)
  aRange.foreach(println)

  (1 to 10).foreach(print) // 12345678910
  (1 to 10).foreach(_ => print("h")) // hhhhhhhhhh

  println

  val aList = List(1, 2, 3)
  val prepended = 42 +: aList :+ 89
  println(prepended) // List(42, 1, 2, 3, 89)

  val apple5 = List.fill(5)("apple")
  println(apple5) // List(apple, apple, apple, apple, apple)
  println(apple5.mkString("-|-")) // apple-|-apple-|-apple-|-apple-|-apple => Join gibi.

  // arrays
  val numbers = Array(1, 2, 3, 4)
  val threeElements = Array.ofDim[String](3)
  threeElements.foreach(println) // null null null

  // mutation
  numbers(2) = 0 // syntax sugar for numbers.update(2, 0)
  println(numbers.mkString(" ")) // 1 2 0 4

  // arrays and seq
  val numbersSeq: Seq[Int] = numbers // implicit conversion
  println(numbersSeq) // ArraySeq(1, 2, 0, 4)
}
