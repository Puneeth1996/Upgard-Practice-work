import java.util.Scanner;
import java.util.*;

public class sortIncDecEveOdd {{

    static void sortIncDec(int arr[], int n) {
        int i = 1;
        int j = n - 1;
        if (j % 2 != 0)
            j--;

        // swapping till half of array
        while (i < j) {
            arr = swap(arr, i, j);
            i += 2;
            j -= 2;
        }

        // Sort first half in increasing
        Arrays.sort(arr, 0, (n + 1) / 2);

        // Sort second half in decreasing
        Arrays.sort(arr, (n + 1) / 2, n);
        int low = (n + 1) / 2, high = n - 1;
        // Reverse the second half
        while (low < high) {
            Integer temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        sortIncDec(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}