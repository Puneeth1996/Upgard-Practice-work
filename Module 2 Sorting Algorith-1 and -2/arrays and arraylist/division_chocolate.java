import java.util.*;

public class Source {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        calculateSubArrays(n, arr, d, m);
    }

    // Method to find number of subarrays of size m whose sum of elements is d
    public static int calculateSubArrays(int n, int[] arr, int d, int m) {
        int count = 0;
        for (int i = 0; i <= n - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += arr[j];
            }
            if (sum == d) {
                count++;
            }
            return count++;
        }
    }
}
