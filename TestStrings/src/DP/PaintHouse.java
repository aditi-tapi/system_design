package DP;

public class PaintHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int costs [][] ={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(minCost(costs));
	}

	private static int minCost(int[][] costs) {
		// TODO Auto-generated method stub
		if(costs.length ==0 || costs == null)
		return 0;
		
		for(int i=1;i<costs.length;i++)
		{
			costs[i][0]+=Math.min(costs[i-1][1],costs[i-1][2]);
			costs[i][1]+=Math.min(costs[i-1][0],costs[i-1][2]);
			costs[i][2]+=Math.min(costs[i-1][0],costs[i-1][1]);
		}
		
		return Math.min(Math.min(costs[costs.length-1][0], costs[costs.length-1][1]), costs[costs.length-1][2]);
		
	}

}
