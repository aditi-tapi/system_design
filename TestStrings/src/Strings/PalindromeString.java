package Strings;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "A man, a plan, a canal: Panama";
		
		a = a.toLowerCase();
		System.out.println(a + "lower a");
		
		int i=0, j= a.length() -1, result=0;
		
		while(i<j)
		{
			if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z' && a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
			{
				if(a.charAt(i) != a.charAt(j))
					System.out.println(0 + "no palindrome");
				i++;
				j--;
			}
			if(a.charAt(i) < 'a' || a.charAt(i) > 'z')
		        i++;
	        System.out.println(a.charAt(i) + "chariout");
	        if(a.charAt(j) < 'a' || a.charAt(j) > 'z')
		        j--;
		}
		System.out.println(1 + "yes palindrome");

	}

}
