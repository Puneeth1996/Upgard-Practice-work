// Repeating and Missing Number
// You are given an unsorted array containing 'n' elements. The elements are in the range from 1 to n. However, one element between 1 and n is missing and one element occurs twice. Find the repeating element and the missing element.

// Consider the array {2, 5, 4, 1, 4}.
// The repeating element is 4 and the missing element is 3.

// Approach

// Traverse the array. While traversing, use the absolute value of every element as an index and make the value at this index negative to mark it visited. If something is already marked negative, then this is the repeating element. To find the missing element, traverse the array again and look for a positive value.
import java.util.*;

public class repMissNum {
    static void find(int arr[], int size) {
        int i;
        // System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0) {
                arr[abs_val - 1] = -arr[abs_val - 1];
            } else {
                System.out.print(abs_val);
                System.out.print(" ");
            }
        }

        // System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0) {
                System.out.print(i + 1);
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        find(arr, n);
    }
}