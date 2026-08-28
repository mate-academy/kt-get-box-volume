fun getBoxVolume(length: Int,wight: Int,height: Int = 1): Int {
    val volume : (Int,Int,Int) -> Int = {
        length,wight,height -> length * wight * height
    }
    return volume(length,wight,height)
}
