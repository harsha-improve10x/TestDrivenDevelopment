package rockpaperscissor;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorTest {

    @Test
    public void nothing() {}

    @Test
    public void givenBothNull_returnNull() {
        RpsGame rpsGame = new RpsGame();
        String result = rpsGame.rps(null, null);
        assertEquals("", result);
    }
}
