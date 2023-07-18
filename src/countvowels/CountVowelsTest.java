package countvowels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsTest {
    private CountVowels countVowels;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        countVowels = new CountVowels();
    }

    @Test
    public void givenNull_returnZero() {
        int result = countVowels.count("");
        assertEquals(0, result);
    }

    @Test
    public void givenA_returnOne() {
        int result = countVowels.count("A");
        assertEquals(1, result);
    }

    @Test
    public void givenE_returnOne() {
        int result = countVowels.count("E");
        assertEquals(1, result);
    }

    @Test
    public void givenAE_returnTwo() {
        int result = countVowels.count("AE");
        assertEquals(2, result);
    }

    @Test
    public void givenCelebration_returnFive() {
        int result = countVowels.count("celebration");
        assertEquals(5, result);
    }

    @Test
    public void givenPalm_returnOne() {
        int result = countVowels.count("palm");
        assertEquals(1, result);
    }
}
