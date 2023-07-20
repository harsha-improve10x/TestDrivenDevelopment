package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;

    private void rollMany(int noOfRolls, int pins) {
        for (int i = 0; i < noOfRolls; i++) {
            game.rolls(pins);
        }
    }

    private void spare() {
        game.rolls(5);
        game.rolls(5);
    }

    private void strike() {
        game.rolls(10);
    }

    @BeforeEach
    public void setup() {
        game = new Game();
    }

    @Test
    public void nothing() {
    }

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
        spare();
        game.rolls(4);
        rollMany(17, 0);
        assertEquals(18, game.score());
    }

    @Test
    public void oneStrike() {
        //10, 4, 2, = 16
        strike();
        game.rolls(4);
        game.rolls(2);
        rollMany(16, 0);
        assertEquals(22, game.score());
    }
}
