import java.util.Hashtable;
import java.util.Set;

public class PermutationString {
	
	public boolean permutationStrin(String a, String b)
	{
		boolean result = false;
		if(a.length() != b.length())
		{
			return false;
		}
		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
		for(int i =0; i<a.length();i++)
		{
			char c = a.charAt(i);
			if(ht.containsKey(c))
			{
				int val = ht.get(c) + 1;
				ht.put(c, val);
			}
			else ht.put(c, 1);
		}
		for(int i =0; i<a.length();i++)
		{
			char c = b.charAt(i);
			if(ht.containsKey(c))
			{
				int val = ht.get(c);
				if(val==0)
					return false;
				val--;
				ht.put(c, val);
			}
			else
				return false;
		}
		
		Set<Character> keys = ht.keySet();
		for(Character k : keys)
		{
			if(ht.get(k)  != 0)
				return false;
		
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = "cbb";
		PermutationString p = new PermutationString();
		System.out.println(p.permutationStrin(a,b));

	}

}
