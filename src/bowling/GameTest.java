package bowling;

import org.testng.annotations.Test;

public class GameTest {

    @Test
    public void nothing() {}

    @Test
    public void canRoll() {
        Game game = new Game();
        game.rolls(1);
    }
}
