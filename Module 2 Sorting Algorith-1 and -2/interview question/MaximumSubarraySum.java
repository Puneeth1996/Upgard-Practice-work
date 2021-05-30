// Maximum Subarray Sum (Divide and Conquer)
// You are given an array containing 'n' elements. The array can contain both positive and negative integers. Determine the sum of the contiguous subarray with the maximum sum.

// Consider the array {8, -9, 3, 6, 8, -5, 7, -6, 1, -3}.
// The maximum subarray will be 3, 6, 8, -5, 7.
// The maximum subarray sum will be 3 + 6 + 8 + (-5) + 7 = 19

// Approach

// Using the divide and conquer approach, you can find the maximum subarray sum in O(nLogn) time. Following is the divide and conquer algorithm:

// Divide the given array into two halves.
// Return the maximum of the following three:
// Maximum subarray sum in the left half (Make a recursive call)
// Maximum subarray sum in the right half (Make a recursive call)
// Maximum subarray sum such that the subarray crosses the midpoint

import java.util.*;

public class MaximumSubarraySum {
    // Find the maximum possible sum in arr[]
    // such that arr[m] is part of it
    static int maxCrossingSum(int arr[], int l, int m, int h) {
        // Include elements on left of mid.
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }

        // Include elements on right of mid
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m + 1; i <= h; i++) {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }

        // Return sum of elements on left
        // and right of mid
        // returning only left_sum + right_sum will fail for
        // [-2, 1]
        return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));
    }

    // Returns sum of maxium sum subarray
    // in aa[l..h]
    static int maxSubArraySum(int arr[], int l, int h) {
        // Base Case: Only one element
        if (l == h)
            return arr[l];

        // Find middle point
        int m = (l + h) / 2;

        /*
         * Return maximum of following three possible cases: a) Maximum subarray sum in
         * left half b) Maximum subarray sum in right half c) Maximum subarray sum such
         * that the subarray crosses the midpoint
         */
        return Math.max(Math.max(maxSubArraySum(arr, l, m), maxSubArraySum(arr, m + 1, h)),
                maxCrossingSum(arr, l, m, h));
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.print(maxSubArraySum(arr, 0, n - 1));
    }
}
