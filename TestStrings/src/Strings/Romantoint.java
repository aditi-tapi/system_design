package Strings;

public class Romantoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="MXCIII";
		
		char roman[] = {'I','V','X','L','C','D','M'};
	    int magnitude [] = {1,5,10,50,100,500,1000};
	    int result = magnitude[getIndex(roman,a,a.length()-1)];
	    for(int i =a.length()-2;i>=0;i-=1)
	    {
//	        System.out.println(a.charAt(i) + "---ai");
//	        System.out.println(a.charAt(i-1) + "---ai-1");
	        
	       if(magnitude[getIndex(roman,a,i+1)] <= magnitude[getIndex(roman,a,i)])
	        {
	            result = result + magnitude[getIndex(roman,a,i)] ;
	            
	        }
	        else if(magnitude[getIndex(roman,a,i+1)] > magnitude[getIndex(roman,a,i)])
	        {
	            result -= magnitude[getIndex(roman,a,i)] ; 
	        }
	        
	    }
	    
	    System.out.println(result + "result");
	}
	
	public static int getIndex(char[] roman, String a, int i)
	{
	 for(int j=0;j<roman.length;j++)
	 {
	     if(a.charAt(i) == roman[j])
	     return j;
	 }
	 
	 return -1;
	}
}



