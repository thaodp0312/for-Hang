package Task;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
class Task5Test {
    Task5 t = new Task5();

    @Test
    public void test_removeAllNumbersGreaterThan10() {
        assertThat(t.removeAllNumbersGreaterThan10(t.createSet())).isNotNull()
                .doesNotContain(11, 12, 13, 14);
    }
}