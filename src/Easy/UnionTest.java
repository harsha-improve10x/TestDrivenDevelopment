package Easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UnionTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNullNull_returnEmpty() {
        Union union = new Union();
        ArrayList<Integer> list = union.makeUnion(null, null);
        assertEquals(new ArrayList<Integer>(){}, list);
    }
}
