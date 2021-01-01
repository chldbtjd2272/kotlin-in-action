package basic

import basic.Color.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BasicTest {
    @Test
    fun name() {
        val person = Person("name")
        assertThat(person.name).isEqualTo("name")
        person.name = "name2"
        assertThat(person.name).isEqualTo("name2")
    }

    @Test
    fun name2() {
        val rectangle = Rectangle(1, 2)
        assertThat(rectangle.isSquare).isEqualTo(false)
        assertThat(rectangle.height).isEqualTo(1)
        assertThat(rectangle.width).isEqualTo(2)
        rectangle.height = 2
        assertThat(rectangle.isSquare).isEqualTo(true)
    }

    @Test
    fun name3() {
        val rectangle = createRandomRectangle()
        assertThat(rectangle.isSquare).isEqualTo(false)
    }

    @Test
    fun name4() {
        assertThat(BLUE.rgb()).isEqualTo(255)
    }

    @Test
    fun name5() {
        assertThat(getMnemonic(RED)).isEqualTo("G")
    }

    @Test
    fun name6() {
        assertThat(mix(RED, BLUE)).isEqualTo("O")
        assertThat(mix(RED, BLACK)).isEqualTo("O")
    }
}