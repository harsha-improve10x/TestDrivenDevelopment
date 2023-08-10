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
        ArrayList<Integer> arrayList = leadersInArray.leaders(null);
        assertEquals(new ArrayList<Integer>(), arrayList);
    }
}
