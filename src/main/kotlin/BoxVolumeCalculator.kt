// create a function and implement it
const val DEFAULT_HEIGHT = 1
const val LENGTH = 5
const val WIDTH = 10
const val HEIGHT = 2

fun main() {
  // Use constants instead of magic numbers
  val volume = getBoxVolume(LENGTH, WIDTH, HEIGHT)
  println("Volume: $volume")
}

fun getBoxVolume(length: Int, width: Int, height: Int = DEFAULT_HEIGHT): Int {
  return length * width * height
}
