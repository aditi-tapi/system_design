package ArrayGeeks;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={11,13,21,3};
		greaterElement(a);

	}

	private static void greaterElement(int[] a) {
		// TODO Auto-generated method stub
		int len = a.length;
		int next;
		Stack s = new Stack();
		for(int i =0;i<len;i++)
		{
			s.push(a[i]);
			//next = a[i+1];
		}
		next = -1;
		for(int i =0;i<len;i++)
		{
			
		}
		
		
	}

}
