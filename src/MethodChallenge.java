public class MethodChallenge {
    public static void main(String[] args) {
        int playerScore = 750;
        int playerPosition = calculateHighScorePosition(playerScore);
        String playerName = "Luigi";
        displayHighScorePosition(playerName, playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playersScore) {
        if (playersScore >= 1000) {
            return 1;
        } else if (playersScore >= 500) {
            return 2;
        } else if (playersScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
