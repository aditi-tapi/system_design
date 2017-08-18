package ArrayGeeks;

public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductArray pa = new ProductArray();
        int arr[] = {10, 3, 5, 6, 2};
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productArray(arr, n);
	}

	private void productArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		int prod[] = new int[n];
		int temp=1;
		
		for(int i =0;i< n;i++)
			prod[i]=1;
		
		for(int i=0;i<n;i++)
		{
			prod[i]= temp;
			temp*=arr[i];
			System.out.println(i + ":i" + prod[i] +":prod" + temp + ":temp***");
			
		}
		temp=1;
		for(int i = n-1;i>=0;i--)
		{
			prod[i]*=temp;
			temp*=arr[i];
			System.out.println(i + ":i" + prod[i] +":prod" + temp + ":temp");
		}
		for (int i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
 
        return;
	}

}
