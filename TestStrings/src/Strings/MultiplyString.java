package Strings;

public class MultiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "99999";
		String b = "99999";
		StringBuilder x= new StringBuilder();
	    StringBuilder y = new StringBuilder();
	    int carry =0, inter_sum=0;
	    
	    long sum = 0;
	    if(a.length()<b.length())
	    {
	    for(int i=a.length()-1;i>=0;i--)
	    {
	        for(int j= b.length()-1;j>=0;j--)
	        {
	            //sum = (sum * 10) + (a.charAt(i)-'0')*(b.charAt(j)-'0');
	            //x.append(String.valueOf((a.charAt(i)-'0')*(b.charAt(j)-'0')));
	            inter_sum = (a.charAt(i)-'0')*(b.charAt(j)-'0') + carry;
	            carry = inter_sum /10;
	            x.append(String.valueOf(inter_sum%10));
	           // y.append(String.valueOf((a.charAt(i)-'0')*(b.charAt(j)-'0'));
	        }
	        x.append(carry);
	        if(sum==0)
	        sum = sum + Integer.valueOf(x.reverse().toString());
	        else
	        	 sum = (long) (sum + Integer.valueOf(x.reverse().toString()) * Math.pow(10, (a.length()-1)-i));
	        x.setLength(0);
	        carry=0;
	    }
	    }
	    else
	    {
	    for(int i=b.length()-1;i>=0;i--)
	    {
	        for(int j= a.length()-1;j>=0;j--)
	        {
	            inter_sum = (a.charAt(i)-'0')*(b.charAt(j)-'0') + carry;
	            carry = inter_sum /10;
	            x.append(String.valueOf(inter_sum%10));
	           // y.append(String.valueOf((a.charAt(i)-'0')*(b.charAt(j)-'0'));
	        }
	        x.append(carry);
	        if(sum==0)
	        sum = sum + Integer.valueOf(x.reverse().toString());
	        else
	        	
	        sum = (long) (sum + Integer.valueOf(x.reverse().toString()) * Math.pow(10, (b.length()-1)-i));
	        x.setLength(0);
	        carry=0;
	    }
	    }
	    System.out.println(String.valueOf(sum));
	}

}
