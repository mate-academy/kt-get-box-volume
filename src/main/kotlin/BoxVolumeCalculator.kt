private const val DEFAULT_HEIGHT = 1

// create a function and implement it
fun getBoxVolume(
    length: Int,
    width: Int,
    height: Int = DEFAULT_HEIGHT
)
        : Int {
    return length * width * height
}
