package tennisgame;

public class Game {
    int points[]=new int[2];
	int hasPlayerWon(int indexOfPlayer){
		
		points[indexOfPlayer]++;
		
		if(Math.abs(points[0]-points[1]) >2 && ( points[0] >3 ||points [1] >3  )){
			return (points[0]>points[1])? 0 :1;
		}
		
		return -1;
		
	}
	

}
