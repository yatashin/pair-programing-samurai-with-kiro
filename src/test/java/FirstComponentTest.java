import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class FirstComponentTest {

    @Test
    public void sayHello() {
        var component = new firstComponent();
        assertThat(component.hello()).isEqualTo("hello");
    }

}