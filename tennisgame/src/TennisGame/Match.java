/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennisgame;

import java.util.ArrayList;

public class Match {
    
    private ArrayList<Set> setlist= new ArrayList<Set>();
    private int setMatch[] = new int[2];
    private int currentMatch;
    public final int MATCH_THRESOLD = 3;
    public Match () {
        currentMatch = 0;
        setlist.add(new Set());
    }
    
    public int processScore(int player) {
        int winner = setlist.get(player).whoWonSet(player);
        if (winner != -1)
        {
            setMatch[winner]++;
            setlist.add(new Set());
            currentMatch++;
            if( setMatch[winner] >= MATCH_THRESOLD )
            {
                if(Math.abs(setMatch[0]-setMatch[1]) >= 1) {
                    return winner;
                }
            }
                        
        }
        
        return -1;
    }
    
    public String getMatch() {
        String matchstr = setMatch[0]+ " " + setMatch[1];
       
        for(Set str: setlist ) {
          matchstr += str.getSet() + " ";  
        }
     return matchstr;       
    }
    
}
