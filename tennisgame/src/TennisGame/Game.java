package TennisGame;

public class Game {
	int points[] = new int[2];
	String states[] = { "0", "15", "30", "40", "A" };

	public int whoWonGame(int indexOfPlayer) {

		points[indexOfPlayer]++;

		if (Math.abs(points[0] - points[1]) > 2
				&& (points[0] > 3 || points[1] > 3)) {
			return (points[0] > points[1]) ? 0 : 1;
		}

		return -1;

	}

	public String getPoints() {

		String pointToReturn = "";
		final int MAXDITECTPOINTS = 3;
		
		if (points[0] < MAXDITECTPOINTS && points[1] < MAXDITECTPOINTS) {
			pointToReturn = pointToReturn + states[points[0]] + "-"
					+ states[points[1]];
		} else if (points[0] == 3 && points[1] < 3) {
			pointToReturn += "40-" + states[points[1]];
		} else if (points[0] < 3 && points[1] == 3) {
			pointToReturn += states[points[0]] + "-40";
		}

		else if (points[0] == points[1])
			pointToReturn += "D";
		else if (points[0] == MAXDITECTPOINTS && points[1] > MAXDITECTPOINTS) {
			pointToReturn += "  -A";
		} else {
			pointToReturn += "A-  ";
		}
		return pointToReturn;
	}

}
