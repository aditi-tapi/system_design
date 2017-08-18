package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "The sky is blue";
		char [] s = s1.toCharArray();
		int start =0, end=0;
		for(int i=0;i<s.length;i++)
		{
			//start=0;
			if(s[i] == ' ')
			{
				end=i-1;
				reverse(s,start,end);
				
				start=end+2;
			}
		}
		System.out.println(start + "start");
		System.out.println(end);
		reverse(s,start,s.length-1);
		reverse(s,0,s.length-1);
		String res = String.valueOf(s);
		System.out.println(res);

	}

	private static void reverse(char[] s, int start, int end) {
		// TODO Auto-generated method stub
		char temp =0;
		while(start<end)
		{
			 temp =  s[start];
			s[start] = s[end];
			s[end] = temp;
			start ++;
			end --;
		}
		System.out.println(s[0]);
	}

}
