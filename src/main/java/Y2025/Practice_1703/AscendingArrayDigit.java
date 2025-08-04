package Y2025.Practice_1703;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AscendingArrayDigit {
    public static void main(String[] args) {

        int[] numbers= {50,40,30,10,20,10,0,1,9};
        int temp =0;

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[j]<numbers[i])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        System.out.println( "Arrays value in Ascening Order " + Arrays.toString(numbers));

        for(int num : numbers) {
            System.out.print( num +" ");
        }

        //Aonther Way
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(numbers[j]>numbers[i])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        System.out.println( "\n");
        System.out.println( "Arrays value in Ascening Order Another Way" + Arrays.toString(numbers));

        for(int num : numbers) {
            System.out.print( num +" ");
        }

    }
}
