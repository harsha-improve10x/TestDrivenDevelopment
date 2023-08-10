package Easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LeadersInArrayTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        LeadersInArray leadersInArray = new LeadersInArray();
        ArrayList<Integer> arrayList = leadersInArray.leaders(null);
        assertEquals(new ArrayList<Integer>(), arrayList);
    }
}
