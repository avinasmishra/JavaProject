package PracTice;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = {1,9,0,5,0,3};
        //optput: [0,0,1,3,5,9]

        //here we can create 2 for loop one start from 0 to < length and another start from 1 to <length-i

        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j< arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Sorted Array::"+arr[i]);
        }

    }
}
