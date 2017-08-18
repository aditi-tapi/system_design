package ArrayGeeks;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 4, 5, 6};
	    int miss = getMissingNo(a, 5);
	    System.out.println(miss);
	}

	private static int getMissingNo(int[] a, int i) {
		// TODO Auto-generated method stub
		int x1=a[0],x2=1,miss=0;
		for(int b=1;b<i;b++)
		{
			x1 = x1 ^ a[b];
		}
		System.out.println(x1);
		for(int b=2;b<=i+1;b++)
		{
			x2 = x2 ^ b;
		}
		System.out.println(x2);
		miss = x1 ^ x2;
			
		return miss;
	}

}
