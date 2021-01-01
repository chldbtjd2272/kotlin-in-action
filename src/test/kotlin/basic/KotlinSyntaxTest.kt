package basic

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class KotlinSyntaxTest {

    @Test
    fun name() {
        assertThat(KotlinSyntax().max(1, 2)).isEqualTo(2);
    }
}