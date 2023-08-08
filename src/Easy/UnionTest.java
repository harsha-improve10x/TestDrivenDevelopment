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
    public void givenEmptyEmpty_returnEmpty() {
       ArrayList<Integer> list = union.makeUnion(new int[]{}, new int[]{});
       assertEquals(new ArrayList<Integer>(){}, list);
    }
}
