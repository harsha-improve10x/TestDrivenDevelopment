package TimeStamp;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TimeStampTest {

    @Test
    public void nothing() {}

    @Test
    public void givenZero_whenGetDisplayDateCalled_returnEmptyString() {
        TimeStamp timeStamp = new TimeStamp();
        String  result = timeStamp.getDisplayDate(0l);
        assertEquals("", result);
    }

    @Test
    public void givenMinusTwelve_whenGetDisplayDateCalled_returnEmptyString() {
        TimeStamp timeStamp = new TimeStamp();
        String  result = timeStamp.getDisplayDate(-12);
        assertEquals("", result);
    }
}
