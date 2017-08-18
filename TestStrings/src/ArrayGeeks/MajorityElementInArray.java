package ArrayGeeks;

public class MajorityElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElementInArray majorelement = new MajorityElementInArray();
		int a[] = new int[]{1, 3, 3, 1, 2};
        int size = a.length;
        majorelement.printMajority(a, size);
	}

	private void printMajority(int[] a, int size) {
		// TODO Auto-generated method stub
		int cand = findCandidate(a,size);
		
		if(isMajority(a,size,cand))
			System.out.println(cand);
		else
			System.out.println("No major element");
			
		
	}

	private boolean isMajority(int[] a, int size, int cand) {
		// TODO Auto-generated method stub
		int i, count =0;
		for(i=0;i<size;i++)
		{
			if(a[cand] ==  a[i])
				count++;
		}
		if(count > size/2)
			return true;
		else
			return false;
	}

	private int findCandidate(int[] a, int size) {
		// TODO Auto-generated method stub
		int maj_index=0,
		count = 1;
		
		for(int i=1; i<size;i++)
		{
			if(a[maj_index] ==  a[i])
				count ++;
			else 
				count --;
			if(count == 0)
				{maj_index =i;
			count=1;}
		}
		return a[maj_index];
	}

}
