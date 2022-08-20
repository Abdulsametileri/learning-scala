package part1basics

object fDefaultArgs extends App {
  // default parametre okey!
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture(width = 800)
  savePicture(height = 600, width = 800, format = "bmp")
}
