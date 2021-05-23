
import java.util.*;

// Java program for implementation of Insertion Sort
class Source {
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
        for (int i = sortedArray_lastNames.length - 1; i >= 0; i--) {
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