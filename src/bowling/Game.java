package bowling;

public class Game {
    private int[] rolls = new int[21];
    private int currentRollIndex = 0;

    public void rolls(int pins) {
        rolls[currentRollIndex] = pins;
        currentRollIndex++;
    }

    public int score() {
        int totalScore = 0;
        int firstInFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(firstInFrame)) {
                totalScore += 10 + rolls[firstInFrame + 1] + rolls[firstInFrame + 2];
                firstInFrame++;
            }
            if (isSpare(firstInFrame)) {
                totalScore += 10 + firstInNextFrame(firstInFrame);
            } else {
                totalScore += twoBallsInAFrame(firstInFrame);
            }
            firstInFrame += 2;
        }
        return totalScore;
    }

    private int twoBallsInAFrame(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1];
    }

    private boolean isStrike(int firstInFrame) {
        return rolls[firstInFrame] == 10;
    }

    private int firstInNextFrame(int firstInFrame) {
        return rolls[firstInFrame + 2];
    }

    private boolean isSpare(int firstInFrame) {
        return twoBallsInAFrame(firstInFrame) == 10;
    }
}
