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
        int result = linearSearch.findNumber(null, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = linearSearch.findNumber(new int[]{}, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenOne_returnOne() {
        int result = linearSearch.findNumber(new int[]{1},0);
        assertEquals(0, result);
    }

    @Test
    public void givenOneTwoThreeFiveSeven_findSeven_returnFour() {
        int result = linearSearch.findNumber(new int[]{1, 2, 3, 5, 7}, 7);
        assertEquals(4, result);
    }

    @Test
    public void givenOneTwoThreeFourFiveSixSevenEight_findFive_returnFour() {
        int result = linearSearch.findNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, 5);
        assertEquals(4, result);
    }
}
