package SubInterview;

import java.util.Arrays;

public class ArrayMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3};
		int []b= {3,2,5};
		int []c= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];

		}
		System.out.println(Arrays.toString(c));//merge
			Arrays.sort(c);//sort
			System.out.println(Arrays.toString(c));
		}

		}
