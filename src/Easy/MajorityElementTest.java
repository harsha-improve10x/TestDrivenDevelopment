package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    private MajorityElement majorityElement;

    @Test
    public void nothing() {}

    @Test
    public void setup() {
        majorityElement = new MajorityElement();
    }

    @Test
    public void givenNull_returnZero() {
        int result = majorityElement.findMajorityElement(null);
        assertEquals(0, result);
    }
}
