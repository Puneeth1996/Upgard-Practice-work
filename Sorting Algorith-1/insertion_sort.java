// Insertion Sort
// Description
// There is a total of N students in Professor X’s school for mutants. Each student has a first name as well as a last name, maintained separately in two separate database columns. One day, Professor X asks a student named Logan to copy the items of both these columns in two separate arrays and sort them using insertion sort. However, the first names should be in ascending order and the last names in descending order. Logan never used insertion sort on an array of strings, so he’s seeking for help. Write a function that takes an array of strings as input and returns the sorted array as output. Assume that the names can only be in lowercase.

// Input:
//       1. The first line will be 'n', the size of the two arrays.
//       2. The next 'n' lines are the first name of the students.
//       3. The next 'n' lines are the last name of the students.

// Output:
//        1. The first 'n' lines are first names arranged in ascending order.
//        2. The next 'n' lines are the last names arranged in descending order.

// HINT: You can use the compareTo() method to compare two strings lexically.

// Sample Input-1:
// 2
// logan
// jean 
// gray 
// wolverine
// Sample Output-1:
// jean
// logan
// wolverine
// gray

// Here 2 represents the size of the arrays for first and last name. Next 2 lines are first names of 2 students "logan" and "jean". Followed by next 2 inputs of their last names, "gray" and "wolverine". The output has first 2 lines representing first names arranged in ascending order (lexicographically). The next two outputs represent last name of the students arranged in descending order (lexicographically).

// Sample Input-2
// 10
// janella
// arianna
// bob
// sheryll
// katelynn
// alphonso
// bertha
// ivette
// michiko
// evelin
// valene
// krista
// lyn
// melony
// laila
// laree
// raylene
// lynwood
// tim
// keech

// Sample Output-2:
// alphonso 
// arianna 
// bertha 
// bob 
// evelin 
// ivette 
// janella 
// katelynn 
// michiko 
// sheryll 
// valene 
// tim 
// raylene 
// melony 
// lynwood 
// lyn 
// laree 
// laila 
// krista 
// keech

// Here 10 represents the size of the arrays for first and last name. Next 10 lines are first names of 10 students. Followed by next 10 inputs of their last names. The output has first 10 lines representing first names arranged in ascending order (lexicographically). The next two outputs represent last name of the students arranged in descending order (lexicographically).

import java.util.*;

// Java program for implementation of Insertion Sort
class Source {
    /* Function to sort array using insertion sort */
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are greater than key, to one position
             * ahead of their current position
             */
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");

        // System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        Source ob = new Source();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        // ob.sort(array);

        // printArray(array);

        String sortedArray_firstNames[] = sort_sub(firstNames, firstNames.length);
        for (int i = 0; i < sortedArray_firstNames.length; i++) {
            System.out.println(sortedArray_firstNames[i]);
        }

        String sortedArray_lastNames[] = sort_sub(lastNames, lastNames.length);
        for (int i = 0; i < sortedArray_lastNames.length; i++) {
            System.out.println(sortedArray_lastNames[i]);
        }
    }

    public static String[] sort_sub(String array[], int f) {
        String temp = "";
        for (int i = 0; i < f; i++) {
            for (int j = i + 1; j < f; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}