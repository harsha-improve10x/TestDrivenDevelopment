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

    @Test
    public void givenBomb_returnsDuck() {
        Bomb bomb = new Bomb();
        String result = bomb.findBomb("Bomb");
        assertEquals("Duck!", result);
    }

    @Test
    public void givenNumbers_returnRelaxThereIsNoBomb() {
        Bomb bomb = new Bomb();
        String result = bomb.findBomb("2345 -123444");
        assertEquals("Relax, there is no Bomb", result);
    }

    @Test
    public void givenThisGoesBoom_returnRelaxThereIsNoBomb() {
        Bomb bomb = new Bomb();
        String result = bomb.findBomb("There is a Boom!!!");
        assertEquals("Relax, there is no Bomb", result);
    }
}
