
const val DEFAULT_HEIGHT = 1
fun getBoxVolume(length: Int, with: Int, height: Int = DEFAULT_HEIGHT): Int {
    return length * with * height
}
