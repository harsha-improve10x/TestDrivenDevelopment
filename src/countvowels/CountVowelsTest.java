package countvowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        CountVowels countVowels = new CountVowels();
        int result = countVowels.count("");
        assertEquals(0, result);
    }

}
