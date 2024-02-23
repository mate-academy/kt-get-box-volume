fun main() {
    println(getBoxVolume(3,3,3))
    println(getBoxVolume(3,3))
}

fun getBoxVolume(length: Int, width: Int, height: Int = 1) : Int {
    return length * width * height
}