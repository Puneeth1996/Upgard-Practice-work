// Merge Two Sorted Arrays
// You are given two sorted arrays. The first array is of size (m+n) with m elements, and the second array is of size n with n elements. Merge the elements from two arrays into one array in the sorted order without using extra space and linear time complexity.

// Approach

// Let the first array be arr1[], and the other array be arr2[].

// Move m elements of arr1[] to the end.
// Start from the nth element of arr1[] and the 0th element of arr2[] and merge them into arr1[].
// Let's hear from Vishwa more about the problem and approach.

import java.util.*;

public class Merge_sort {
    static void merge(int arr1[], int arr2[], int n1, int n2, int arr3[]) {
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < n1 && j < n2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        int arr1[] = new int[m + n];
        int arr2[] = new int[n];

        for (int i = 0; i < m + n; i++)
            arr1[i] = s.nextInt();

        for (int i = 0; i < n; i++)
            arr2[i] = s.nextInt();

        int[] arr3 = new int[m + n];
        merge(arr1, arr2, m, n, arr3);
        System.out.println(Arrays.toString(arr3).replace(",", "").replace("]", "").replace("[", ""));
    }
}