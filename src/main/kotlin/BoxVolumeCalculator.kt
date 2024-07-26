fun <T : Number> getBoxVolume(length: T, width: T, height: T = 1 as T): Double {
    val lengthDouble = length.toDouble()
    val widthDouble = width.toDouble()
    val heightDouble = height.toDouble()
    return lengthDouble * widthDouble * heightDouble
}
