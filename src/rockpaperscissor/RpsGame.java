package rockpaperscissor;

public class RpsGame {
    public String rps(String player1, String player2) {
        String result = "";
        if (player1 == null || player2 == null) {
            result = "";
        } else if (player1.equalsIgnoreCase("Rock") && player2.equalsIgnoreCase("paper") ||
        player1.equalsIgnoreCase("Scissor") && player2.equalsIgnoreCase("rock") ||
        player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("scissor")) {
            result = "Player2 Wins";
        } else if (player1.equalsIgnoreCase("Paper") && player2.equalsIgnoreCase("Rock") ||
        player1.equalsIgnoreCase("Rock") && player2.equalsIgnoreCase("Scissor") ||
        player1.equalsIgnoreCase("Scissor") && player2.equalsIgnoreCase("paper")) {
            result = "Player1 Wins";
        }
        return result;
    }
}
