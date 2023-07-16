package convertminutesintoseconds;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesToSecondsTest {

    @Test
    public void nothing() {}

    /*
    Problem: Write a function that takes an integer minute and converts it into seconds.
    Examples:
    convert(5) → 300
    convert(3) → 180
    convert(2) → 120
    convert(45) →2700
     */

    @Test
    public void givenEmpty_returnsZero() {
        MinutesToSeconds minutesToSeconds = new MinutesToSeconds();
        int result = minutesToSeconds.convert(0);
        assertEquals(0, result);
    }
}
