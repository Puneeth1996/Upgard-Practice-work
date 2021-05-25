import java.util.Scanner;
import java.io.*;
import java.util.*;

class Source {
    public static int[] sortarray(int[] value) {
        for (int arrayIterator = 0; arrayIterator < value.length; arrayIterator++) {
            for (int iterator2 = arrayIterator + 1; iterator2 < value.length; iterator2++) {
                if (value[iterator2] < value[arrayIterator]) {
                    int temp = value[arrayIterator];
                    value[arrayIterator] = value[iterator2];
                    value[iterator2] = temp;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Details of the First Array - ");
        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        System.out.println("Details of the Second Array - ");
        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        // Write your code here
        // the first array is almost sorted
        int[] sort_array1 = new int[n1];
        sort_array1 = sortarray(array1);
        System.out.println(Arrays.toString(sort_array1));
        System.out.println(array1[array1.length - 1]);
        for (int i = 0; i < n2; i++) {
            if (array2[i] < array1[array1.length - 1]) {
                System.out.println(array2[i]);
            }
        }

        // Sample I

        // 5

        // 2 7 8 6 13

        // 4

        // 15 11 9 5

        // Sample Ou

        // Explana

        // Element 6 in array1 can be replaced by element 11 (maximum poss
        // ble) in

        // Sample I

        // 2

        // 14

        // the second array is to checked with the last element in of the first array
        // if insert in the right postion

    }
}
