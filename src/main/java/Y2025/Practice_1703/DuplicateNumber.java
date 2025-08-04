package Y2025.Practice_1703;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,10,30,40};

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i] == numbers[j])
                {
                    System.out.println("Duplicate Number: "+numbers[i]);
                }
            }
        }

    }
}
