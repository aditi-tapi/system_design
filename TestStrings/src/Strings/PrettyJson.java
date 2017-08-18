package Strings;

import java.util.ArrayList;

public class PrettyJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "\\{\"id\":100,\"firstName\":\"Jack\",\"lastName\":\"Jones\",\"age\":12\\}";
		ArrayList<String> result = new ArrayList<String>();
	    StringBuilder str;
	    int j=0;
	    
	    for(int i=0;i<a.length();i++)
	    
	    {
	        if(a.charAt(i) == '{' || a.charAt(i) == '[' || a.charAt(i) == '}' || 
	        a.charAt(i) == ']' || a.charAt(i) == '\"' || a.charAt(i)>= 'A' || 
	        a.charAt(i) <= 'Z' || a.charAt(i)>= 'a' || a.charAt(i) <= 'z' || 
	        a.charAt(i)>= '0' || a.charAt(i) <= '9')
	        str = new StringBuilder();
	        str = new StringBuilder();
	        
	        while(i>0)
	        str.append("\t");
	        if(a.charAt(i) == '\"' || a.charAt(i) >= 'A' || a.charAt(i) <= 'Z' || 
	        a.charAt(i)>= 'a' || a.charAt(i) <= 'z' || 
	        a.charAt(i)>= '0' || a.charAt(i) <= '9')
	        {
	            while(a.charAt(i) != ',' || a.charAt(i) != ':')
	            {
	                str.append(a.charAt(i));
	                i++;
	            }
	            
	        }
	        str.append(a.charAt(i));
	        result.add(str.toString());
	    }

	}

}
