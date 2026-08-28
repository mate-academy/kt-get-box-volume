// create a function and implement it
const val LENGTH = 5
const val WIDTH = 5
const val HEIGHT = 5

fun getBoxVolume(length: Int, width: Int, height: Int = 1): Int {
    return length * width * height
}

fun main() {
    println(getBoxVolume(LENGTH, WIDTH, HEIGHT))
}
