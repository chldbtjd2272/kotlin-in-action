package basic_2

import basic.createRandomRectangle
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class KotlinSyntaxTest2 {

    @Test
    fun name3() {
        val rectangle = createRandomRectangle()
        Assertions.assertThat(rectangle.isSquare).isEqualTo(false)
    }
}