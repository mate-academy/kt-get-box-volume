// create a function and implement it
fun main() {
  val length = 5
  val width = 10
  val height = 2

  val volume = getBoxVolume(length, width, height)
  println("Volume: $volume")
}

fun getBoxVolume(length: Int, width: Int, height: Int = 1): Int {
  return length * width * height
}
