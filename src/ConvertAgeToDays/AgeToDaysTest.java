package ConvertAgeToDays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeToDaysTest {
    private AgeToDays ageToDays;

    /*
    Problem: Create a function that takes the age in years and returns the age in days.
    Examples:   calcAge(65) ➞ 23725
                calcAge(0) ➞ 0
                calcAge(20) ➞ 7300
     */

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        ageToDays = new AgeToDays();
    }

    @Test
    public void givenZero_returnZero() {
        int days = ageToDays.convert(0);
        assertEquals(0, days);
    }

    @Test
    public void givenTwenty_returnSevenThousandThreeHundred() {
        int days = ageToDays.convert(20);
        assertEquals(7300, days);
    }

    @Test
    public void givenSixtyFive_returnTwentyThreeThousandSevenTwentyFive() {
        int days = ageToDays.convert(65);
        assertEquals(23725, days);
    }
}
