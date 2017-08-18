package Strings;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="5121478262 8070067M75 X199R 547 8C0A11 93I630 4P4071 029W433";
		char flag = '+';
	    int i =0;
	    if(s.length() < 1 || s == null)
	        System.out.println(0);
	    while(i<s.length() && s.charAt(i) == ' ')
	        i++;
	    if(s.charAt(i) == '+')
	        i++;
	    
	    else if(s.charAt(i) == '-')
	    {
	        flag = '-';
	        i++;
	    }
	    double num =0;
	    
	    while(i<s.length() &&s.charAt(i)>= '0' && s.charAt(i) <= '9' )
	    {
	    	//System.out.println(i + "before is");
	        num = num *10 + (s.charAt(i)-'0');
	        //System.out.println(num + "after num");
	        i++;
	       //System.out.println(num + " " + s.charAt(i) + " " + num + " " + i);
	        if(num > Integer.MAX_VALUE)
	        	System.out.println(Integer.MAX_VALUE + "max");
            if(num < Integer.MIN_VALUE)
            	System.out.println(Integer.MIN_VALUE + "min");
	    }
	    if(flag == '-')
	    num = -num;
	    
	    System.out.println((int)num);
	}

}
