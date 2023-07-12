package scoring;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ScoringTest {
    private Scoring scoring = new Scoring();


    @Test
    public void nothing() {
    }

    @Test
    public void giveNull() {
        int[] allNull = scoring.calculateScores(null);
        assertArrayEquals(new int[3],allNull);
    }

    @Test
    public void giveEmpty() {
        int[] empty = scoring.calculateScores("");
        assertArrayEquals(new int[3],empty);
    }

    @Test
    public void giveOneA_returnsOneZeroZero() {
        int[] aValue = scoring.calculateScores("A");
        assertArrayEquals(new int[]{1, 0, 0}, aValue);
    }

    @Test
    public void giveOneB_returnsZeroOneZero() {
        int[] bValue = scoring.calculateScores("B");
        assertArrayEquals(new int[]{0, 1, 0}, bValue);
    }

    @Test
    public void giveOneC_returnsZeroZeroOne() {
        int[] cValue = scoring.calculateScores("C");
        assertArrayEquals(new int[]{0, 0, 1}, cValue);
    }

    @Test
    public void giveAB_returnsOneOneZero() {
        int[] abValue = scoring.calculateScores("AB");
        assertArrayEquals(new int[]{1, 1, 0}, abValue);
    }

    @Test
    public void giveABC_returnsOneOneOne() {
        int[] abcValue = scoring.calculateScores("ABC");
        assertArrayEquals(new int[]{1, 1, 1}, abcValue);
    }

    @Test
    public void giveAABC_returnsTwoOneOne() {
        int[] aAbcValue = scoring.calculateScores("AABC");
        assertArrayEquals(new int[]{2, 1, 1}, aAbcValue);
    }

    @Test
    public void giveAABBC_returnsTwoTwoOne() {
        int[] aAbBcValue = scoring.calculateScores("AABBC");
        assertArrayEquals(new int[]{2, 2, 1}, aAbBcValue);
    }

    @Test
    public void giveAABBCC_returnsTwoTwoTwo() {
        int[] aAbBcCValue = scoring.calculateScores("AABBCC");
        assertArrayEquals(new int[]{2, 2, 2}, aAbBcCValue);
    }

    @Test
    public void giveABBACCCCAC_returnsThreeTwoFive() {
        int[] aBBaCCCCaCValue = scoring.calculateScores("ABBACCCCAC");
        assertArrayEquals(new int[]{3, 2, 5}, aBBaCCCCaCValue);
    }
}
