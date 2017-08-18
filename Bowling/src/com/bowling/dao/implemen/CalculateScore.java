package com.bowling.dao.implemen;

import java.util.ArrayList;
import java.util.List;

import com.bowling.dao.iface.ICalculateScore;
import com.bowling.domain.Output;
import com.bowling.domain.Player;

public class CalculateScore implements ICalculateScore{

	

	@Override
	public List<Output> getTheScore(String c, int[] player) {
		
			List<Output> output = new ArrayList<Output>();
			
			
			for(int i =0;i<player.length;i++)
				if(player[i]==0)
				{
					Output o = new Output();
					Player p = new Player();
					p.setPlayerName(p+String.valueOf(i));
					p.getPreviousInput();
					p.getPreviousScore();
					o.setPlayer(p);
					output.add(o);
					
				}
				else if(player[i]==1)
				{
					Output o = new Output();
					Player p = new Player();
			
					p.setPlayerName(p+String.valueOf(i));
					p.getPreviousInput();
					StringBuilder b = new StringBuilder();
					b.append(p.getPreviousInput());
					b.append(c);
					p.setPreviousInput(b.toString());
					o.setTotalScore(calculateScore(c.charAt(0)));
					p.setTotalScoreTillNow(calculateScore(c.charAt(0)) + p.getPreviousScore());
					o.setPlayer(p);
					output.add(o);
				}
			
			
				
				
			
			return output;
		}
	private static int calculateScore(char charAt) {
		// TODO Auto-generated method stub
		if(charAt == '/')
			return 15;
		else if(charAt == 'x')
			return 20;
		else if(charAt >= '0' && charAt <= '9')
			return charAt - '0';
		return 0;
			
		
		
		
	}

}

	

