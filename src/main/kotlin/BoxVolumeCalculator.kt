fun getBoxVolume(length: Int, width: Int, height: Int = 1) : Int {
    val boxDimensions: (Int, Int, Int) -> Int = { length, width, height -> length.times(width).times(height) }
    return boxDimensions(length, width, height)
}
