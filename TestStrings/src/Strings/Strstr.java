package Strings;

public class Strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba ";
		String needle = "babaaa";
		if(haystack.isEmpty() || needle.isEmpty())
		    System.out.println(-1);
		    
		    if(haystack.length() < needle.length())
		    	System.out.println(-1);
		    
		    //System.out.println(haystack.length() + "---haystack");
		    //System.out.println(needle.length() + "---needle");
		    int start_haystack =0, needle_index=0,count = 0,i=0;
		    for( i=0;i<haystack.length();i++)
		    {
		       //System.out.println(i + "---i---" + needle_index + "needindx---" + count + "---count---" + start_haystack + "---startidx");
		        while(i<haystack.length() && needle_index < needle.length() && ( haystack.charAt(i) == needle.charAt(needle_index)))
		        {
		            i++;
		            needle_index++;
		            count++;
		        }
		       // System.out.println(haystack.charAt(i) + "---haystk");
		        //System.out.println(needle.charAt(needle_index) + "---d=needle");
		        System.out.println(count + "---count");
		        if(count == needle.length())
		        System.out.println(i-count);
		        i=start_haystack;
		        start_haystack++;
		        
		        needle_index=0;
		        count =0;
		    }

	}

}
