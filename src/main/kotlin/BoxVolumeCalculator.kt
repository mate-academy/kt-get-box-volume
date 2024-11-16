// create a function and implement it
const val DEFAULT_HEIGHT = 1

fun main() {
  val length = 5
  val width = 10
  val height = 2

  val volume = getBoxVolume(length, width, height)
  println("Volume: $volume")
}

fun getBoxVolume(length: Int, width: Int, height: Int = DEFAULT_HEIGHT): Int {
  return length * width * height
}
