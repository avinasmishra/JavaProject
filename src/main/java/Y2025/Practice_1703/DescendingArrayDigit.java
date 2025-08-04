package Y2025.Practice_1703;

import java.util.Arrays;

public class DescendingArrayDigit {
    public static void main(String[] args) {

        int[] numbers= {50,40,30,10,20,10,0,1,9};
        int temp =0;

        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[j]>numbers[i])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        System.out.println( "Arrays value in Descending Order " + Arrays.toString(numbers));

        for(int num : numbers) {
            System.out.print( num +" ");
        }

        //Aonther Way
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0 ;j<numbers.length;j++)
            {
                if(numbers[j]<numbers[i])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        System.out.println( "\n");
        System.out.println( "Arrays value in Descending Order Another Way" + Arrays.toString(numbers));

        for(int num : numbers) {
            System.out.print( num +" ");
        }

    }
}
