
import java.util.*;

class Source {
    /*
     * This function takes last element as pivot, places the pivot element at its
     * correct position in sorted array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right of pivot
     */
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /*
     * The main function that implements QuickSort() arr[] --> Array to be sorted,
     * low --> Starting index, high --> Ending index
     */
    void sort(int arr[], int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    // Linear-search function to find the index of an element
    public static int findIndex(int arr[], int t)
    {
 
        // if array is Null
        if (arr == null) {
            return -1;
        }
 
        // find length of array
        int len = arr.length;
        int i = 0;
 
        // traverse in the array
        while (i < len) {
 
            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    // Driver program
    public static void main(String args[]) {
        Source ob = new Source();

        Scanner scanner = new Scanner(System.in);
        String s = "";
        int size = scanner.nextInt();
        String words[] = new String[size];
        int sortedArr[] = new int[size];
        int words_lendth[] = new int[size];
        for (int i = 0; i < size; i++) {
            s = scanner.next().toLowerCase();
            words[i] = s;
            words_lendth[i] = s.length();
            sortedArr[i] = s.length();
        }
        ob.sort(sortedArr, 0, size - 1);
        // System.out.println(Arrays.toString(words_lendth));
        // System.out.println(Arrays.toString(sortedArr));
        // printArray(arr);
        int index_temp = 0;
        for ( int i = 0; i<size; i++){
            index_temp = findIndex(words_lendth, sortedArr[i]);
            System.out.println(words[index_temp]);
        }
    }
}