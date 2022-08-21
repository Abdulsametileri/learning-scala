package part3fp

object MapFlatmapFilterFor extends App {
  val list = List(1, 2, 3)
  println(list) // List(1, 2, 3)
  println(list.head) // 1
  println(list.tail) // List(2, 3)

  println(list.map(_ + 1)) // List(2, 3, 4)
  println(list.map(_ + " is a number")) // List(1 is a number, 2 is a number, 3 is a number)

  println(list.filter(_ % 2 == 0)) // List(2)

  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair)) // List(1, 2, 2, 3, 3, 4) // her 1 elementi pairlemek için 2 for gibi.

  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  // 2 for --> flatMap and map
  // 3 for --> flatMap, flatMap and map

  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations) // List(a1, b1, c1, d1, a2, b2, c2, d2, a3, b3, c3, d3, a4, b4, c4, d4)

  val combinations3 = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + color)))
  println(combinations3) // List(a1black, a1white, b1black, b1white, c1black, c1white, d1black, d1white, a2black, a2white, b2black, b2white, c2black, c2white, d2black, d2white, a3black, a3white, b3black, b3white, c3black, c3white, d3black, d3white, a4black, a4white, b4black, b4white, c4black, c4white, d4black, d4white)

  list.foreach(println) // teker teker tüm elemanları yazar

  // for-comprehensions
  val forCombinations = for {
    n <- numbers
    c <- chars
    color <- colors
  } yield {
    "" + c + n + color
  }
  println(forCombinations) // 28 ile aynı işi daha readable yapıyor.

  val forCombinations2 = for { // if yazabiliyosun.
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield {
    "" + c + n + color
  }
  println(forCombinations2)

  for {
    n <- numbers
  } yield {
    println(n)
  }

  // syntax overload
  list.map {x => x*2}


}
