package Y2025.Practice_1703;

import java.util.Arrays;

public class MoveAllZeroToRight {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1};
        moveZerosToEnd(arr);
        System.out.println("After shifting zeros to the end: " + Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] arr) {
        int index = 0;  // position to place the next non-zero element

        // Step 1: Place non-zero elements at the beginning
        for (int i=0;i< arr.length;i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i] ;
                index++;
            }
        }
        // Step 2: Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
}

