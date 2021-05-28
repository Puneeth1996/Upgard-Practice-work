
import java.util.Scanner;

public class sum_closest_zero {
    static void sumClosestToZero(int arr[], int n) {
        // Write code here

    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sumClosestToZero(arr, n);
    }
}