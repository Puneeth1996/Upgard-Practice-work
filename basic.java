import java.util.*;

class Source {
    public static int compar_count = 0;

    public static int binarySearch(int arr[], int first, int last, int key) {
        int mid = first + (last - first) / 2;
        if (arr[mid] == key) {
            // return mid;
            compar_count++;
            return compar_count;
        }
        if (arr[mid] > key) {
            compar_count++;
            binarySearch(arr, first, mid - 1, key);// search in left subarray
        } else {
            compar_count++;
            binarySearch(arr, mid + 1, last, key);// search in right subarray
        }
    }

    public static void main(String args[]) throws Exception {
        Source bs = new Source();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        int result = binarySearch(array, 0, size, key);
        if (result >= 0)
            System.out.println(result);
    }
}
