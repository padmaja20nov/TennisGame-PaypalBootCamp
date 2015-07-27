package tennisgame;

public class ScoreBoard {
	
	Match match;
	
	void processScore(String winnerNames){
		
		for(char c:winnerNames.toCharArray()){
			Match.computeScore(c);
		}
		
	}

}
