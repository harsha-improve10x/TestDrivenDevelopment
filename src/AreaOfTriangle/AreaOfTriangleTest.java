package AreaOfTriangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfTriangleTest {
    private AreaOfTriangle areaOfTriangle;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        areaOfTriangle = new AreaOfTriangle();
    }

    @Test
    public void givenZero_returnZero() {
        int result = areaOfTriangle.findTriArea(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenMinusOneZero_returnMinValue() {
        int result = areaOfTriangle.findTriArea(-1, 0);
        assertEquals(-1, result);
    }

    @Test
    public void givenMinusOneMinusTwo_returnMinValue() {
        int result = areaOfTriangle.findTriArea(-1, -2);
        assertEquals(-1, result);
    }

    @Test
    public void givenThreeAndTwo_returnThree() {
        int result = areaOfTriangle.findTriArea(3, 2);
        assertEquals(3, result);
    }

    @Test
    public void givenSevenAndFour_returnFourteen() {
        int result = areaOfTriangle.findTriArea(7, 4);
        assertEquals(14, result);
    }

    @Test
    public void givenTenAndTen_returnFifty() {
        int result = areaOfTriangle.findTriArea(10, 10);
        assertEquals(50, result);
    }
}
