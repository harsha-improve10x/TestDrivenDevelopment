package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UnionTest {
    private Union union;
    public void nothing() {}

    @BeforeEach
    public void setup() {
        union = new Union();
    }

    @Test
    public void givenNullNull_returnEmpty() {
        ArrayList<Integer> list = union.makeUnion(null, null);
        assertEquals(new ArrayList<Integer>(){}, list);
    }

    @Test
    public void givenNullOne_returnOne() {
        ArrayList<Integer> list = union.makeUnion(null, new int[]{1});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, list);
    }

    @Test
    public void givenOneNull_returnOne() {
        ArrayList<Integer> list = union.makeUnion(new int[]{1}, null);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, list);
    }

    @Test
    public void givenNullOneTwoThree_returnOneTwoThree() {
        ArrayList<Integer> list = union.makeUnion(null, new int[]{1, 2, 3});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, list);
    }

    @Test
    public void givenEmptyEmpty_returnEmpty() {
       ArrayList<Integer> list = union.makeUnion(new int[]{}, new int[]{});
       assertEquals(new ArrayList<Integer>(){}, list);
    }

    @Test
    public void givenOneElement_returnOne() {
        ArrayList<Integer> list = union.makeUnion(new int[]{1}, new int[]{});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, list);
    }

    @Test
    public void givenOneOneElement_returnOne() {
        ArrayList<Integer> list = union.makeUnion(new int[]{1}, new int[]{1});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, list);
    }

    @Test
    public void givenOneTwoOneThreeElement_returnOne() {
        ArrayList<Integer> list = union.makeUnion(new int[]{1, 2}, new int[]{1, 3});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, list);
    }

    @Test
    public void givenOneTwoFiveThreeSixEightElement_returnOne() {
        ArrayList<Integer> list = union.makeUnion(new int[]{1, 2, 5}, new int[]{3, 6, 8});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(6);
        expected.add(8);
        assertEquals(expected, list);
    }

    @Test
    public void givenElement_returnOneTwoThreeFourFive() {
        ArrayList<Integer> list = union.makeUnion(new int[]{1, 2, 2, 3, 4}, new int[]{1, 5});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, list);
    }
}
