package Y2025.Practice_1703;

import java.util.Arrays;

public class MoveAllZeroToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1};
        moveZerosToStart(arr);
        System.out.println("After shifting zeros to the left: " + Arrays.toString(arr));
    }
    public static void moveZerosToStart(int[] arr) {
        int index = arr.length -1;  // position to place the next non-zero element

        // Step 1: Place non-zero elements at the end
        for (int i= arr.length-1;i>=0;i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i] ;
                index--;
            }
        }
        // Step 2: Fill remaining positions with 0
        while (index >=0) {
            arr[index] = 0;
            index--;
        }
    }
}

