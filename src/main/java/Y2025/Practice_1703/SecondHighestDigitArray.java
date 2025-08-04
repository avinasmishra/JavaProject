package Y2025.Practice_1703;

import java.util.Arrays;

public class SecondHighestDigitArray {
    public static void main(String[] args) {

        int[] numbers= {50,80,30,10,20,10,0,1,9};
        int temp =0;

        for(int i=0;i<numbers.length;i++)
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
        System.out.println("2nd Hightest Array number is : "+numbers[1]);

    }
}
