package FindBomb;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FindBombTest {

    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnsRelaxThereIsNoBomb() {
        Bomb bomb = new Bomb();
        String result = bomb.findBomb("");
        assertEquals("Relax, there is no Bomb", result);
    }
}
