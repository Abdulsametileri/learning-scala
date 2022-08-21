package part3fp

object TuplesAndMaps extends App {
  // tuples = finite ordered "lists"
  val aTuple = (2, "hello, Scala") // Tuple2[Int, String] = (Int, String)

  println(aTuple._1) // 2
  println(aTuple._2) // hello, Scala
  println(aTuple.copy(_2 = "goodbye Java")) // (2,goodbye Java)
  println(aTuple.swap) // (hello, Scala,2)

  // Maps - keys -> values
  val aMap: Map[String, Int] = Map()
  val phonebook = Map(("Jim", 555), "Daniel" -> 789, ("JIM", 9000)).withDefaultValue(-1)
  // a -> b is sugar for (a, b)
  println(phonebook) // Map(Jim -> 555, Daniel -> 789, JIM -> 9000)
  println(phonebook.contains("Jim")) //true
  println(phonebook("Jim")) // 555 ;
  println(phonebook("Mary")) //withDefaultValue -1 verdiğin için olmayan keyde -1 döncek yazmasaydın key not found exception throw ederdi.

  // add a pairing
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing
  println(newPhonebook) // Map(Jim -> 555, Daniel -> 789, JIM -> 9000, Mary -> 678)
  println(phonebook.toList) // List((Jim,555), (Daniel,789), (JIM,9000))

  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))
  /*
   HashMap(J -> List(James, Jim),
    A -> List(Angela),
    M -> List(Mary),
    B -> List(Bob),
    D -> List(Daniel))
  */

  println(names.groupBy(name => name.charAt(0) == 'J'))
}
