
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "def".toLowerCase();
		String b = "def".toLowerCase();
		
		int aa[] = new int[26];
		int bb[] = new int[26];
		int cc[] = new int[26];
		
		for(int i=0;i< a.length();i++)
		{
			char ca = a.charAt(i);
			System.out.println(ca + "ca");
			aa[ca - 97]++;
			//System.out.println(aa[i]);
			bb[b.charAt(i) - 97]++;
			//System.out.println(bb[i]);
			
		}
		for(int i=0;i< aa.length;i++)
		{
			cc[i] = aa[i] - bb[i];
			System.out.println(cc[i] + "cc[i]");
		}
		int sum =0;
		for(int i=0;i< aa.length;i++)
		{
			sum = sum + Math.abs(cc[i]);
			System.out.println(sum/2 + "sum/2");
		}
		
	}

}
