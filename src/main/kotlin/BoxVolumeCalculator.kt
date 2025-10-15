
fun getBoxVolume (length: Int, width: Int, height: Int = 1) : Int {
  return getArea(length, width) * height
}

val getArea: (Int, Int) -> Int = { lenght, width ->
    lenght * width
}