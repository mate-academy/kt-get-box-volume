private const val SIDE_VALUE_TEST = 3

fun main() {
    println(getBoxVolume(SIDE_VALUE_TEST,SIDE_VALUE_TEST,SIDE_VALUE_TEST))
    println(getBoxVolume(SIDE_VALUE_TEST,SIDE_VALUE_TEST))
}

fun getBoxVolume(length: Int, width: Int, height: Int = 1) : Int {
    return length * width * height
}