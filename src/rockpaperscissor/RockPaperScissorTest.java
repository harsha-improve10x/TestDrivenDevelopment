package rockpaperscissor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorTest {
    private  RpsGame rpsGame;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        rpsGame = new RpsGame();
    }

    @Test
    public void givenBothNull_returnNull() {
        String result = rpsGame.rps(null, null);
        assertEquals("", result);
    }

    @Test
    public void givenOneEmptyOneNull_returnEmpty() {
        String result = rpsGame.rps("", null);
        assertEquals("", result);
    }

    @Test
    public void givenTwoEmpty_returnEmpty() {
        String result = rpsGame.rps("", "");
        assertEquals("", result);
    }

    @Test
    public void givenRockEmpty_returnEmpty() {
        String result = rpsGame.rps("Rock", "");
        assertEquals("", result);
    }

    @Test
    public void givenEmptyRock_returnEmpty() {
        String result = rpsGame.rps("", "rock");
        assertEquals("", result);
    }

    @Test
    public void givenPaperEmpty_returnEmpty() {
        String result = rpsGame.rps("paper", "");
        assertEquals("", result);
    }

    @Test
    public void givenEmptyPaper_returnEmpty() {
        String result = rpsGame.rps("", "paper");
        assertEquals("", result);
    }

    @Test
    public void givenScissorEmpty_returnEmpty() {
        String result = rpsGame.rps("Scissor", "");
        assertEquals("", result);
    }

    @Test
    public void givenEmptyScissors_returnEmpty() {
        String result = rpsGame.rps("", "Scissor");
        assertEquals("", result);
    }

    @Test
    public void givenRockPaper_returnPlayer2Wins() {
        String result = rpsGame.rps("Rock", "Paper");
        assertEquals("Player2 Wins", result);
    }

    @Test
    public void givenPaperRock_returnPlayer1Wins() {
        String result = rpsGame.rps("Paper", "rock");
        assertEquals("Player1 Wins", result);
    }
}
