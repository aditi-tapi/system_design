package DP;


import java.util.*;

public class LongestIncreasingThenDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer>();
		A.add(8);
		A.add(6);
		A.add(3);
		A.add(4);
		A.add(2);
		A.add(1);
		int longest =0,max=0 ;
        ArrayList<Integer> lis = new ArrayList<Integer>();
        ArrayList<Integer> lds = new ArrayList<Integer>();
        //lis.set(0,A.get(0));
        for(int i=0;i<A.size();i++)
        {
            if(lis.size()==0)
            {
                lis.add(A.get(i));
            }
            else if(A.get(i)>=lis.get(lis.size()-1))
            {
                lis.add(A.get(i));
            }
            else if(A.get(i) < lis.get(lis.size()-1))
            {
                int start = 0, end = lis.size()-1;
                while(start<end)
                {
                    int mid = (end + start)/2;
                    if(A.get(i)>lis.get(mid))
                    start=mid+1;
                    else
                    end=mid;
                }
                lis.set(end,A.get(i));
                
            }
            if(lds.size()==0)
            {
                lds.add(A.get(i));
            }
            else if(A.get(i)<lds.get(lds.size()-1))
            {
                lds.add(A.get(i));
            }
            else if(A.get(i) > lds.get(lds.size()-1))
            {
                int start = 0, end = lds.size()-1;
                while(start<end)
                {
                    int mid = (end + start)/2;
                    if(A.get(i)>lds.get(mid))
                    end=mid-1;
                    else
                    start=mid;
                }
                lds.set(start,A.get(i));
                
            }
            //System.out.println(lis.get(i) + "--lis");
            //System.out.println(lds.get(i) + "--lds");
            max = Math.max(max, (lis.size()+lds.size()-1));
        }
        
        System.out.println(max + "max"); 

	}

}



