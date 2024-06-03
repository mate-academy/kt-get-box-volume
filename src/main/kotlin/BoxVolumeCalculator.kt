// create a function and implement it
fun main() {
    println(getBoxVolume(3, 4,5))
}
fun getBoxVolume(length: Int, width: Int,height: Int = 1): Int {
    return length * width * height
}
