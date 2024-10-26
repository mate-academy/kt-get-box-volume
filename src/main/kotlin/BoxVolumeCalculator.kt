// create a function and implement it

fun getBoxVolume(length: Int, width: Int, height: Int = 1): Int{
    val getVolume: (Int, Int, Int) -> Int = {length, width, height ->
        length*width*height
    }

    return getVolume(length, width, height)

}
