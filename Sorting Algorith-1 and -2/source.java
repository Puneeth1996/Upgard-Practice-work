
import java.util.*;

public class Source {

    String names[];
    int length;

    public static void main(String[] args) {
        Source sorter = new Source();
        // String words[] = { "zz", "aa", "cc", "hh", "bb", "ee", "ll" }; // the strings
        // need to be sorted are put inside
        // this array
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String words[] = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scanner.next().toLowerCase();
        }
        sorter.sort(words);

        for (String i : words) {
            System.out.println(i);
            // System.out.print(" ");
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        // call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}