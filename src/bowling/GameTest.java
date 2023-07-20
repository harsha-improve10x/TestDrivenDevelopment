package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;

    private void rollMany(int noOfRolls, int pins) {
        for (int i = 0; i<noOfRolls; i++) {
            game.rolls(pins);
        }
    }
    @BeforeEach
    public void setup() {
      game = new Game();
    }

    @Test
    public void nothing() {}

    @Test
    public void canRoll() {
        game.rolls(1);
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }



    @Test
    public void allOnes() {
      rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void oneSpare() {
        //5, 5, 4 = 18
        game.rolls(5);
        game.rolls(5);
        game.rolls(4);
        rollMany(17, 0);
        assertEquals(18, game.score());
    }
}
