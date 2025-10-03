private const val DEFAULT_HEIGHT = 1

fun getBoxVolume(length: Int, width: Int, height: Int = DEFAULT_HEIGHT): Int {
    return length * width * height
}

fun main() {
    println(getBoxVolume(5, 3))
    println(getBoxVolume(5, 3, 2))
}
