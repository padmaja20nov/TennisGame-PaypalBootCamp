package TennisGame;

public class ScoreBoard {
	
	Match match;
	
	void computeScore(String winnerNames){
		
		for(char c:winnerNames.toCharArray()) {
			if (c == 'D') {
				match.computeScore(0);
			} else {
				match.computeScore(1);
			}	
		}
	}
	
	public String getScore() {
		return match.getMatchScore();
	}

}
