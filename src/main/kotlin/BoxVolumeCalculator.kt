fun getBoxVolume(length: Int, width: Int, height: Int = 1): Int {
    return length * width * height
}

fun main() {
    println(getBoxVolume(5, 3))
    println(getBoxVolume(5, 3, 2))
}
