package bowling;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void nothing() {}

    @Test
    public void canRoll() {
        Game game = new Game();
        game.rolls(1);
    }

    @Test
    public void gutterGame() {
        Game game = new Game();
        for (int i=0; i<20; i++) {
            game.rolls(0);
        }
        assertEquals(0, game.score());
    }
}
