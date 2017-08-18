package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.bowling.domain.Output;
import com.bowling.domain.Player;

public class BowlingGame {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Enter number of players");
		int n = s.nextInt();
		HashMap<Integer, Player> map = new HashMap<Integer, Player>();
		
		map=mapsSlotsandPlayers1(n);
		
		
		int chanceperset = 2;
		int set = 10;
		int total_chances = (set -1)*2 + 3;
		
		List<Output> output = new ArrayList<Output>();
		
		
		for(int j = 0; j < total_chances; j++)
		{
			System.out.print("Enter scores");
			String c = s.next();
			
			int[] player = getPlayer(map,j);
			
			
			output = getTheScore(c,player,output,j);
			
 
			
			for(int i =0;i<n;i++)
			{
			System.out.println(output.get(i).getPlayer().getPlayerName() + ":" + output.get(i).getPlayer().getPreviousInput() + 
					"->"+ output.get(i).getPlayer().getTotalScoreTillNow() + "\n");
			
			}
			
			
		}
		Output o = new Output();
		o = maxScoregetMaxScore(output);
		System.out.println(o.getPlayer().getPlayerName() + "is the winner with" +  o.getPlayer().getTotalScoreTillNow() +"score");
		

	}

	
	private static Output maxScoregetMaxScore(List<Output> output) {
		Output o = new Output();
		int max =0;
		for(int i=0;i<output.size();i++)
		{
			if(output.get(i).getPlayer().getTotalScoreTillNow() > max)
				o = output.get(i);
		}
		return o;
		// TODO Auto-generated method stub

	}


	private static int[] getPlayer(HashMap<Integer, Player> map, int j) {
		int [] player = new int[map.size()];
		for(int k=0;k<map.size();k++)
			player[k]=0;
		
		Player p = new Player();
		if(map.containsKey(j))
			p = map.get(j);
		int len = p.getPlayerName().length();
		int i = Integer.parseInt(p.getPlayerName().substring(len-1, len));
		player[i]= 1;
			
		// TODO Auto-generated method stub
		return player;
	}


	private static HashMap<Integer, Player> mapsSlotsandPlayers1(int n) {
		// TODO Auto-generated method stub
		HashMap<Integer, Player> map = new  HashMap<Integer, Player>();
		int k=0;
		for(int i =0;i<n;i++)
		{
			Player p = new Player();
		 
			p.setPlayerName("p"+String.valueOf(i));
				
			map.put(k, p);
			map.put(k+1, p);
			k++;
		}
		return map;
	}

	
	private static List<Output> getTheScore(String c, int[] player,List<Output> output,int j) {
		//List<Output> output = new ArrayList<Output>();
		//List<Output> current = new ArrayList<Output>();
		Output o;
		Player p;
		
		
		for(int i =0;i<player.length;i++)
			if(player[i]==1)
			{
				if(j==0)
				{
					o = new Output();
					p = new Player();
				}
				else
				{
					o = output.get(i);
					p = o.getPlayer();
				}
		
				p.setPlayerName(p+String.valueOf(i+1));
//				p.getPreviousInput();
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
