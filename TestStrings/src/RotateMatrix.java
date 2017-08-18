
public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2},{3,4}};
		transpose(arr);
		reverse(arr);
				
	}

	private static void reverse(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i =0; i< arr.length;i++)
		{
			for(int j=0, k = arr.length -1;j<k;j++,k--)
		
			{
				int x = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = x;
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr.length;j++)
				System.out.println(arr[i][j]);
		}

		
	}

	private static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i =0; i< arr.length;i++)
		{
			for(int j=i;j<arr[0].length;j++)
		
			{
				int x = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = x;
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr.length;j++)
				System.out.println(arr[i][j]);
		}

	}

}
