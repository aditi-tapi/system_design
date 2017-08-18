
public class IsUniqueStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		//boolean result = false;
		for(char ch : s.toCharArray())
		{
			if(s.indexOf(ch) == s.lastIndexOf(ch))
				System.out.println("true");
			else 
				{
				System.out.println("false");
				break;
				}
		}
	}

}
