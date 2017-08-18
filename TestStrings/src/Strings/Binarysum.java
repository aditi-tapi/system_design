package Strings;

public class Binarysum {

	public static void main(String[] args) {
StringBuilder result = new StringBuilder();
	    String a = "1010110111001101101000";
	    String b = "1000011011000000111100110";
	    
	    int carry =0;
	    for(int i=Math.min(a.length(),b.length())-1;i>=0;i--)
	    {
	        
	            if(a.charAt(i) == '1' && b.charAt(i) == '1')
	            {
	                result.append(0);
	                carry=1;
	            }
	            else if(a.charAt(i) == '1' && b.charAt(i) == '0')
	            {
	                result.append(1);
	                
	            }
	            else if(a.charAt(i) == '0' && b.charAt(i) == '1')
	            {
	                result.append(1);
	              
	            }
	            else if(a.charAt(i) == '0' && b.charAt(i) == '0')
	            {
	                result.append(0);
	                
	            }
//	        }
//	        if(i<=Math.min(a.length(),b.length()))
//	        {
//	            if(a.length()<b.length())
//	            {
//	            	if(carry == 1 && b.charAt(i) == 1)
//	                {
//	                    result.append(0);
//	                    carry = 1;
//	                }
//	                else if(carry == 0 && b.charAt(i) == 1)
//	                {
//	                    result.append(1);
//	                  
//	                }
//	                else if(carry == 0 && b.charAt(i) == 0)
//	                {
//	                    result.append(0);
//	                    
//	                }
//	                else if(carry == 1 && b.charAt(i) == 0)
//	                {
//	                    result.append(1);
//	                    
//	                }
//	            }
	            
	        }
	
	        result.append(carry);
	    }
	    //System.out.println(result.reverse().toString());
	}


