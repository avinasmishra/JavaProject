package SubInterview;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,0,5};
		int length=a.length;
		int  temp=a[0];
				a[0]=a[length-1];
		a[length-1]=temp;
		System.out.println(Arrays.toString(a));
			}
		

	}



