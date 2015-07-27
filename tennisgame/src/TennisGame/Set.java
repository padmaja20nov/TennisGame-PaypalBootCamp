package TennisGame;
import java.util.ArrayList;

public class Set {
	
	private ArrayList<Game> gameList = new ArrayList<Game>();
	private int setPoint[] = new int [2];
	private int currentGame;
	
	public final int SET_THRESHOLD = 6; 
	
	public Set () {
		currentGame = 0;
		gameList.add(new Game());
	}
	
	public int whoWonSet (int player) {
		int winner = gameList.get(currentGame).whoWonGame(player);
		if (winner != -1) {
			setPoint[winner]++;
			gameList.add(new Game());
			currentGame++;
			if (setPoint[winner] >= SET_THRESHOLD) {
				if (Math.abs(setPoint[0] - setPoint[1]) == 2) {
					currentGame = -1;
					return winner;
				}
			}
		}
		return -1;
	}
	
	public String getSetScore () {
		if (currentGame != -1) {
			return String.valueOf(setPoint[0]) + " " + String.valueOf(setPoint[1]) + "\n" + gameList.get(currentGame).getPoints();
		} else {
			return String.valueOf(setPoint[0]) + " " + String.valueOf(setPoint[1]);
		}
	}
	
}
