package part3fp

import scala.util.Random

object Options extends App {
  // null check vs. gerek yok Option bizim için yapıyor.
  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  // WORK with unsafe APIs
  def unsafeMethod(): String = null
  //  val result = Some(null) // WRONG
  val result = Option(unsafeMethod()) // Some or None
  println(result)

  // chained methods
  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod())) // orElse; Option nullsa çalışır

  // DESIGN unsafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")
  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  println(myFirstOption.isEmpty) // none or not
  println(myFirstOption.get) // unsafe dont use this.
  println(noOption.getOrElse(5))

  println(myFirstOption.map(_ * 2)) // Some(8)  _ * 2 <=> x => x * 2
  println(myFirstOption.filter(x => x > 10)) // None
  println(myFirstOption.flatMap(x => Option(x * 10))) // Some(40)


  val config: Map[String, String] = Map(
    // fetched from elsewhere
    "host" -> "176.45.36.1",
    "port" -> "80"
  )
  class Connection {
    def connect = "Connected" // connect to some server
  }
  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }

  val forConnectionStatus = for {
    host <- config.get("host")
    port <- config.get("port")
    connection <- Connection(host, port)
  } yield connection.connect

  forConnectionStatus.foreach(println)
}
