package namegreetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameGreetingsTest {
    private NameGreetings nameGreetings;
    /*
    problem:    Create a function that takes a name
                 and returns a greeting in the form of a string.
    Examples:   helloName("Gerald") ➞ "Hello Gerald!"
                helloName("Tiffany") ➞ "Hello Tiffany!"
                helloName("Ed") ➞ "Hello Ed!"
     */

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        nameGreetings = new NameGreetings();
    }
    @Test
    public void givenEmpty_returnHello() {
        String result = nameGreetings.helloName("");
        assertEquals("Hello !", result);
    }

    @Test
    public void givenGerald_returnHelloGerald() {
        String result = nameGreetings.helloName("Gerald");
        assertEquals("Hello Gerald!", result);
    }

    @Test
    public void givenEd_returnHelloEd() {
        String result = nameGreetings.helloName("Ed");
        assertEquals("Hello Ed!", result);
    }

    @Test
    public void givenShree_Harsha_returnHelloShree_Harsha() {
        String result = nameGreetings.helloName("Shree Harsha");
        assertEquals("Hello Shree Harsha!", result);
    }
}
