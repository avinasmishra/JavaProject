package Y2025.Practice_1703;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthElementFinder {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println(k + "rd Largest: " + findKthLargest(arr, k));
      //  System.out.println(k + "rd Smallest: " + findKthSmallest(arr, k));
    }


    // Kth Largest using Min Heap
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);   // Add the number to the heap
            if (minHeap.size() > k)
                minHeap.poll();  // Remove the smallest element
        }
        return minHeap.peek();   //The kth largest element
    }

    // Kth Smallest using Max Heap
    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return maxHeap.peek();
    }



}
