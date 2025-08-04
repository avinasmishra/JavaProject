package Y2025.Practice_1703;

public class MonotonicCheck  {
    public static boolean isStrictlyMonotonic(int[] arr) {
        if (arr.length < 2)
        {
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                increasing = false;
            }
            if (arr[i] <= arr[i + 1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        System.out.println(isStrictlyMonotonic(new int[]{ 2, 3, 4, 5}));  // true
        System.out.println(isStrictlyMonotonic(new int[]{4, 3, 2, 1}));     // true
        System.out.println(isStrictlyMonotonic(new int[]{9, 2, 13, 4, 15})); // false
        System.out.println(isStrictlyMonotonic(new int[]{2, 4, 6, 8}));  // true
    }
}
