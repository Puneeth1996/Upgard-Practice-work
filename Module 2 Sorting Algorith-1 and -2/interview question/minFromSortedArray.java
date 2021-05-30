// Minimum Element in a Sorted and Rotated Array
// You are given a sorted array of 'n' elements. The array has been rotated on an unknown pivot. You need to find the minimum element in the array.
// Approach
// You can solve this using binary search. The minimum element is the only element whose previous element is greater than it. If there is no previous element, then there is no rotation (the first element is the minimum). You check this condition for the middle element by comparing it with the (mid-1) th and (mid+1) th elements.
// If the minimum element is not at the middle (neither mid nor mid+1), then the minimum element lies in either the left half or the right half. 
// If the middle element is smaller than the last element, then the minimum element lies in the left half.
// Else, the minimum element lies in the right half.

public class minFromSortedArray {
    public static int minimum(int arr[], int low, int high) {

        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low)
            return arr[0];

        // If there is only one element left
        if (high == low)
            return arr[low];

        // Find mid
        int mid = low + (high - low) / 2; /* (low + high)/2; */

        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid + 1] < arr[mid])
            return arr[mid + 1];

        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];

        // Decide whether we need to go to left half or right half
        if (arr[high] > arr[mid])
            return minimum(arr, low, mid - 1);
        return minimum(arr, mid + 1, high);
    }

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(minimum(arr, 0, n - 1));
    }
}