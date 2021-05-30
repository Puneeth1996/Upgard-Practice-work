import java.util.Scanner;

class descresing {
    public static int max(int arr[], int low, int high) {
        int mid = (high + low) / 2;
        if (arr[mid] < arr[high] && arr[mid] < arr[low]) {
            return max(arr, low, mid - 1);
        } else if (arr[mid] > arr[high] && arr[mid] > arr[low]) {
            return max(arr, mid + 1, high);
        }
        return arr[mid];
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(max(arr, 0, n - 1));
    }

}
// Approach

// The standard binary search algorithm can be modified for this question.

// If the mid element is greater than both its adjacent elements, then the mid
// is the maximum.
// If the mid element is greater than its next element and smaller than the
// previous element, then the maximum lies on the left side of the mid. Example
// array: {3, 50, 10, 9, 7, 6}
// If the mid element is smaller than its next element and greater than the
// previous element, then maximum lies on the right side of the mid. Example
// array: {2, 4, 6, 8, 10, 3, 1}