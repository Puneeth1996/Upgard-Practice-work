import java.util.Scanner;

class Source {

    // Returns number of pairs
    // in arr[0..n-1] with sum
    // equal to 'sum'
    static void printPairs(int arr[], int n, int sum) {
        // int count = 0;

        // Consider all possible pairs
        // and check their sums
        boolean flag = false;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == sum)
                    flag = true;
        if (flag)
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        // storing the input integers to an array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();

        // write your code here
        printPairs(array, n, targetSum);

    }
}
