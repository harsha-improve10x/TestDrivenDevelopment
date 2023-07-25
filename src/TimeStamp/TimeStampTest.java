package TimeStamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TimeStampTest {
    private TimeStamp timeStamp;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        timeStamp = new TimeStamp();
    }


    @Test
    public void givenZero_whenGetDisplayDateCalled_returnEmptyString() {
        String  result = timeStamp.getDisplayDate(0l);
        assertEquals("", result);
    }

    @Test
    public void givenMinusTwelve_whenGetDisplayDateCalled_returnEmptyString() {
        String  result = timeStamp.getDisplayDate(-12);
        assertEquals("", result);
    }

    @Test
    public void givenGetCurrentDate_whenGetDisplayDateCalled_returnDate() {
        String  result = timeStamp.getDisplayDate(-12);
        assertEquals("", result);
    }
}
