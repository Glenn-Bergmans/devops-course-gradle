import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    public void getGreeting() throws Exception {
        // GIVEN
        String name = "Simon";

        // WHEN
        String actual = Greeter.getGreeting(name);

        // THEN
        assertThat(actual).isEqualTo("Hello Simon!");
    }

}