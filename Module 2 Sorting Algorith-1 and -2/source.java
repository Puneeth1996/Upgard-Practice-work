import java.util.Random;

import java.util.Arrays;
import java.util.Random;

class Source {
    public static int partition(int arr[], int left, int right) {
        int pivot = arr[left];
        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] > pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;

    }

    public static void sorting(int arr[], int left, int right) {
        if (left < right) {
            int q = partition(arr, left, right);
            sorting(arr, left, q);
            sorting(arr, q + 1, right);
        }
    }

    // Driver Code
    // 2 | 4 | 6 | 8 | 10 | 12 | 14 | 16 | 18 | 20
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int n = arr.length;

        sorting(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }

    // Write your code here
}
