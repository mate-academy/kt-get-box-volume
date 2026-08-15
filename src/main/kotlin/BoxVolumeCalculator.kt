// create a function and implement it
//./gradlew detekt - check style in gradle
fun getBoxVolume(length: Int, width: Int, height: Int = 1): Int {
    return length * width * height
}
