
public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		String s = Integer.toBinaryString(n);
		int len = s.length();
		int pw = (int)Math.pow(2, len) - 1;
		//int index = s.indexOf("1");
		//String sub = s.substring(index);
		//System.out.println(sub);
		System.out.println(Math.abs(n - pw) + "result");

	}

}
