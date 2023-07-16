package convertminutesintoseconds;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesToSecondsTest {
    private MinutesToSeconds minutesToSeconds;

    @Test
    public void nothing() {
    }

    @BeforeEach
    public void setup() {
        minutesToSeconds = new MinutesToSeconds();
    }

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
        int result = minutesToSeconds.convert(0);
        assertEquals(0, result);
    }

    @Test
    public void givenNegativeNumber_returnZero() {
        int result = minutesToSeconds.convert(-23);
        assertEquals(0, result);
    }

    @Test
    public void givenTwentyFive_returnThousandFiveHundred() {
        int result = minutesToSeconds.convert(25);
        assertEquals(1500, result);
    }
}
