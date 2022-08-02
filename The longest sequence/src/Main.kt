fun main() {
    val list = MutableList(readln().toInt()) { readln().toInt() }
    var maxLength = 1
    var length = 1
    for (i in 0..list.size - 2) {
        if (list[i + 1] >= list[i]) length += 1 else length = 1
        if (maxLength < length) maxLength = length
    }
    println(maxLength)
}