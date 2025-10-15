private const val WIDTH = 1
fun getBoxVolume (length: Int, width: Int, height: Int = WIDTH) : Int {
  return getArea(length, width) * height
}

val getArea: (Int, Int) -> Int = { lenght, width ->
    lenght * width
}