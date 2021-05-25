import java.util.Scanner;

import java.util.Arrays;

class source {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        // Sample Input 00:

        // 5

        // 2 7 8 6 13

        // 4

        // 15 11 9 5

        // Sample Output 00:

        // 11

        // Explanation 00:

        // Element 6 in array1 can be replaced by element 11 (maximum possible) in
        // array2.

        // Sample Input 01:

        // 5

        // 2 7 8 6 13

        // 4

        // 14 15 16 17

        // Sample Output 01:

        // Not Possible

        // Explanation 01:

        // 6 is the misplaced element in array1 making it unsorted. It is not possible
        // to make array1 sorted from the elements in array2 because all elements in
        // array2 are greater than 13.

        // Write your code here
        // So sort the second arry in descending order.
        Arrays.sort(array2);

        // System.out.printf("Modified array2[] : %s", Arrays.toString(array2));
        // System.out.println(" ");
        int can_replace = 0;
        int replace_number_from_array2 = 0;

        // Then start from index 1 for the first array. If any element after it has a

        // // The loop should end before n-2
        // // or
        // // should check the boundary lengths
        // if ((i + 1 <= n1) && (array1[i] < array1[i + 1])) {
        // continue;
        // // should check if the there is a next to next element from i th index of the
        // // array 1
        // // if ((i + 2 <= n1) && (array1[i + 2])) {
        // // // continue;
        // // for (int j = 0; j < n2; j++) {
        // // if (array2[j] < array1[i + 2]) {
        // // can_replace = array2[j];
        // // } else {
        // // can_replace = 0;
        // // }

        // // }
        // // }

        // // value not in sync enter loop
        // // The loop should then try the values from the sorted arry to see if it's
        // sync
        // // with the sequence
        // // If it is return the value. That's all.
        // // Once traversing through the entire loop is complete and the value is not
        // // found
        // // Put not possible

        // } else {
        // if (i + 1 < n1) {
        // System.out.println("%s " + array1[i] + " : " + array1[i + 1]);
        // }
        // }
        // System.out.println("\n\n");
        // System.out.println(Arrays.toString(array1));
        // System.out.println("\n\n");
        for (int i = 0; i <= n1 - 2; i++) {
            if (!(array1[i] < array1[i + 1])) {
                // System.out.println(
                // "This is the element, we should replace this element and check if array1[i] >
                // replacing_element < (ele,emt from 2nd array) = "
                // + array1[i + 1]);
                for (int j = 0; j < n2; j++) {
                    // System.out.println(
                    // array2[j] + " | Pair : " + array1[i] + " and " + array1[i + 1] + " and " +
                    // array1[i + 2]);

                    // System.out.println(array1[i] < array2[j]);
                    // System.out.println(array2[j] < array1[i + 1]);
                    if ((array1[i] < array2[j]) && (array2[j] < array1[i + 2])) {
                        // System.out.println(array2[j]);
                        can_replace = 1;
                        replace_number_from_array2 = array2[j];
                    }
                }
            }

        }
        if (can_replace == 1) {
            System.out.println(replace_number_from_array2);
        } else {
            System.out.println("Not Possible");
        }
    }
}
