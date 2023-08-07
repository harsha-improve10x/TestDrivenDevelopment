package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {
    private  LinearSearch linearSearch;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        linearSearch = new LinearSearch();
    }

    @Test
    public void givenNull_returnZero() {
        int result = linearSearch.findNumber(null);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = linearSearch.findNumber(new int[]{});
        assertEquals(0, result);
    }
}
