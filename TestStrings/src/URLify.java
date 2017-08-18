
public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mr John Smith";
		int len = 13;
		System.out.println(urlify(s, len));
	}

	private static String urlify(String s, int len) {
		// TODO Auto-generated method stub
		//char [] ch = s.toCharArray();
		String str [] = s.split(" ");
		StringBuilder sb = new StringBuilder(str[0]);
		for(int i =1;i< str.length;++i)
		{
			sb.append("%20");
			sb.append(str[i]);
			
		}
		
		return sb.toString();
	}

}
