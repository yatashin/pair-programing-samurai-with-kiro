import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class firstTest {
    @Test
    void firstFailed() {

        assertEquals(1, 1);
        assertThat(1).isEqualTo(0);
    }
}