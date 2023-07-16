package HoursAndMinutesToSeconds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Time;

import static org.junit.Assert.assertEquals;

public class HoursAndMinutesToSeconds {
    private TimeConvertor time;

    /*
    problem:    Write a function that takes two integers (hours, minutes),
                converts them to seconds, and adds them.
    example:    convert(1, 3) ➞ 3780
                convert(2, 0) ➞ 7200
                convert(0, 0) ➞ 0
     */

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        time = new TimeConvertor();
    }
    @Test
    public void givenZeros_returnZero() {
        int result = time.convert(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenTwoAndZero_returnSevenThousandTwoHundred() {
        int result = time.convert(2, 0);
        assertEquals(7200, result);
    }

    @Test
    public void givenOneAndThree_returnThreeThousandSevenEighty() {
        int result = time.convert(1, 3);
        assertEquals(3780, result);
    }
}
