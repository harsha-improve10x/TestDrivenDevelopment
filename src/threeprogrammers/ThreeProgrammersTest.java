package threeprogrammers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeProgrammersTest {

    @Test
    public void nothing(){}

    @Test
    public void findSolution() {
        ThreeProgrammers threeProgrammers = new ThreeProgrammers();
        int diff = threeProgrammers.findDifference(45, 3, 22);
        assertEquals(42, diff);
    }
}
