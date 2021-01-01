package basic

import java.util.*

class Rectangle(var height: Int, var width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}


fun getMnemonic(color: Color) =
    when (color) {
        Color.BLUE -> "R"
        Color.RED -> "G"
        Color.BLACK -> "G"
    }

fun mix(color1: Color, color2: Color) =
    when (setOf(color1, color2)) {
        setOf(Color.RED, Color.BLUE) -> "O"
        setOf(Color.RED, Color.BLACK) -> "K"
        else -> throw RuntimeException()
    }