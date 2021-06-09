import java.util.*;

class Source {
    // function to check whether
    // the array contains a set
    // of contiguous integers
    static boolean areElementsContiguous(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);

        // After sorting, check if
        // current element is either
        // same as previous or is
        // one more.
        for (int i = 1; i < n; i++)
            if (arr[i] - arr[i - 1] > 1)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        // array to store the input elements
        int[] array = new int[n];

        // storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // Write your code here
        if (areElementsContiguous(array, n))
            System.out.println("Yes");

        else
            System.out.println("No");

    }
}
