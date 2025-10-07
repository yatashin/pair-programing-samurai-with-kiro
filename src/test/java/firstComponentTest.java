import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class firstComponentTest {

    @Test
    public void firstComponentTest() {
        var component = new firstComponent();
        assertThat(component.hello()).isEqualTo("hello");
    }

}