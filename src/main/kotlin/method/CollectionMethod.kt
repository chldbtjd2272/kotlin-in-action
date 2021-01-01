package method

class CollectionMethod {
    val list = listOf(1, 2, 3)
}

private var b = 1
fun operation(): Int {
    b++;
    return b
}

fun <T> Collection<T>.joinToString(separator: String = ""): String {
    val result = StringBuilder()
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    return result.toString()
}