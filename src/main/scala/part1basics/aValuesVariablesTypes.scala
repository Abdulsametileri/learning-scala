package part1basics

object aValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  /*
    Sonradan bu x e farklı değer geçemezsin.
    Mesela x = 2 hata verir.
    Dolayısıyla val --> immutable'dır.

    :Int optional, compiler kendi type inferencesi var yani
    val x = 42 'de valid.
  */

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true

  val aChar: Char = 'a'

  val aShort: Short = 12423 // short=16bit signed int
  val aLong: Long = 1231321312123123L // long=64bit signed int ; SONU L ile
  val aFloat: Float = 2.0F // Sonu F ile ; 32bit
  val aDouble: Double = 3.14 // Sonu bir şeyle bitmesine gerek yk default Double ; 64bit

  // ----- VARIABLES -----

  var aVariable: Int = 4
  aVariable = 5 // mutability creates side effects


}
