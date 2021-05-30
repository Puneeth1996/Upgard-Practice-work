
import java.util.Scanner;

public class infiniteBinarySearch {

    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    static int infiniteArray(int arr[], int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the key");
        int key;
        key = s.nextInt();

        System.out.println(infiniteArray(arr, key) + "\n");
    }
}