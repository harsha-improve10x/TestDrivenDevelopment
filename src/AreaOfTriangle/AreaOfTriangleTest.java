package AreaOfTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfTriangleTest {

    @Test
    public void nothing() {}

    @Test
    public void givenZero_returnZero() {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        int result = areaOfTriangle.findTriArea(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenMinusOneZero_returnMinValue() {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        int result = areaOfTriangle.findTriArea(-1, 0);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void givenMinusOneMinusTwo_returnMinValue() {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        int result = areaOfTriangle.findTriArea(-1, -2);
        assertEquals(Integer.MIN_VALUE, result);
    }
}
