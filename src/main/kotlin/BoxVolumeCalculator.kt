private const val DEFAULT_HEIGHT = 1
private const val LENGTH_ONE = 5
private const val WIDTH_ONE = 3
private const val HEIGHT_TWO = 2

fun getBoxVolume(length: Int, width: Int, height: Int = DEFAULT_HEIGHT): Int {
    return length * width * height
}

fun main() {
    println(getBoxVolume(LENGTH_ONE, WIDTH_ONE))
    println(getBoxVolume(LENGTH_ONE, WIDTH_ONE, HEIGHT_TWO))
}
