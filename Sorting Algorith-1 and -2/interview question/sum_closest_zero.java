
import java.util.Scanner;
import java.util.Arrays;

public class sum_closest_zero1 {

    static void sumClosestToZero(int arr[], int n) {
        Arrays.sort(arr);
        int l = 0;
        int r = n - 1;
        int sum = arr[l] + arr[r];
        while (l < r) {
            if (sum < 0)
                l++;
            else if (sum > 0)
                r--;
            sum = arr[l] + arr[r];
        }
        System.out.println(sum + "" + arr[l] + "" + arr[r]);
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