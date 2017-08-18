package DP;

import java.util.Stack;

public class MaximalRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] ={{1,0,0,1,1,1},{1,0,1,1,0,1},{0,1,1,1,1,1},{0,0,1,1,1,1}};
		System.out.println(maximumArea(mat));

	}

	private static int maximumArea(int[][] mat) {
		// TODO Auto-generated method stub
		int max=0;
		
		int [] height = new int[mat[0].length];
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				if(mat[i][j] == 0)
				height[j]= 0;
				else
					height[j]+=1;
			}
			int area = maxHistogram(height);
			if(area>max)
				max=area;
		}
		
		return max;
		
	}

	private static int maxHistogram(int[] height) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		int max =0,i=0;
		while(i<height.length)
		{
			if(stack.isEmpty() || height[i]>=height[stack.peek()])
			{
				stack.push(i);
				i++;
			}
			else
			{
				int h = height[stack.pop()];
				int w = stack.isEmpty()?i : i- stack.peek() - 1;
				max=Math.max(max, h*w);
			}
				
			
		}
		while(!stack.isEmpty())
		{
			int h = height[stack.pop()];
			int w = stack.isEmpty()?i : i- stack.peek() - 1;
			max=Math.max(max, h*w);
		}
		
		return max;
	}

}
