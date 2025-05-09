// create a function and implement it
const val DEFAULT_VALUE = 1
fun getBoxVolume(length: Int, width: Int,height: Int = DEFAULT_VALUE): Int {
    return length * width * height
}
