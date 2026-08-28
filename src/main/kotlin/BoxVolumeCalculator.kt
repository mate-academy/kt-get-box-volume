// create a function and implement it
fun getBoxVolume(length: Int, width: Int, height: Int = 1) : Int {
    return getArea(length, width) * height
}

val getArea: (Int, Int) -> Int = {length, width ->
    length * width
}
