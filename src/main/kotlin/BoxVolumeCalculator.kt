// create a function and implement it
const val ONE = 1

val calculateVolume: (Int, Int, Int) -> Int = { length, width, height ->
    length * width * height
}

fun getBoxVolume(length: Int, width: Int, height: Int = ONE): Int {
    return calculateVolume(length, width, height)
}