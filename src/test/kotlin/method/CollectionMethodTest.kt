package method

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionMethodTest {
    @Test
    fun name() {
        assertThat(CollectionMethod().list.maxOrNull()).isEqualTo(3)
        assertThat(CollectionMethod().list.first()).isEqualTo(1)
    }

    @Test
    fun name2() {
        assertThat(operation()).isEqualTo(2)
    }

    @Test
    fun name3() {
        val list = listOf(1, 2, 3)
        assertThat(list.joinToString(",")).isEqualTo("1,2,3")
    }
}