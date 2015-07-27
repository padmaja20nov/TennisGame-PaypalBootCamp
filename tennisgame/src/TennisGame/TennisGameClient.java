package TennisGame;

public class TennisGameClient {

	public static void main() {
		TennisGame tennisGame = new TennisGame();
		tennisGame.computeScore("DFF");
		System.out.println(tennisGame.getScore());
	}
}
