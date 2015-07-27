package TennisGame;

public class TennisGame {
	private ScoreBoard scoreBoard = new ScoreBoard();
	
	public void computeScore (String playerPoints) {
		scoreBoard.computeScore(playerPoints);
	}
	
	public String getScore () {
		return scoreBoard.getScore();
	}
}
