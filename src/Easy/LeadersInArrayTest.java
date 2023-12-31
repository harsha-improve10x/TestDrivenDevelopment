package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LeadersInArrayTest {
    private  LeadersInArray leadersInArray;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        leadersInArray = new LeadersInArray();
    }

    @Test
    public void givenNull_returnEmpty() {
        ArrayList<Integer> arrayList = leadersInArray.leaders(null);
        assertEquals(new ArrayList<Integer>(), arrayList);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        ArrayList<Integer> arrayList = leadersInArray.leaders(new int[]{});
        assertEquals(new ArrayList<Integer>(), arrayList);
    }

    @Test
    public void givenOne_returnOne() {
        ArrayList<Integer> arrayList = leadersInArray.leaders(new int[]{1});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, arrayList);
    }

    @Test
    public void givenOneZero_returnOneZero() {
        ArrayList<Integer> arrayList = leadersInArray.leaders(new int[]{1, 0});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(0);
        assertEquals(expected, arrayList);
    }

    @Test
    public void givenFourSevenOneZero_returnSevenOneZero() {
        ArrayList<Integer> arrayList = leadersInArray.leaders(new int[]{4, 7, 1, 0});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(1);
        expected.add(0);
        assertEquals(expected, arrayList);
    }

    @Test
    public void givenTenTwentyTwoTwelveThreeZeroSix_returnTwentyTwoTwelveSix() {
        ArrayList<Integer> arrayList = leadersInArray.leaders(new int[]{10, 22, 12, 3, 0, 6});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(22);
        expected.add(12);
        expected.add(6);
        assertEquals(expected, arrayList);
    }
}
