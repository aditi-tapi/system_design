
public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,0,1},{1,1,1},{1,1,1}};
		
		zeromatrix(a);
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[0].length;j++)
				System.out.println(a[i][j]);
		}

	}

	private static void zeromatrix(int[][] a) {
		// TODO Auto-generated method stub
		for(int i =0;i< a.length;i++)
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0)
				{
					System.out.println(i + "i");
					System.out.println(j + "j");
					swapwithzero(a,i,j);
				}
			}
	}

	private static void swapwithzero(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		for(int a =0; a <arr.length;a++)
		{
			arr[a][j] = 0;
			arr[i][a] = 0;
		}
		for(int ii =0;ii<arr.length;ii++)
		{
			for(int jj =0;jj<arr[0].length;jj++)
				System.out.println(arr[ii][jj]);
		}
	}

}
