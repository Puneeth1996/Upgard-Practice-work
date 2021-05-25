
import java.util.Scanner;
import java.io.*;
import java.util.*;

class Source {
    public static int[] merge(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            answer[k++] = a[i] < b[j] ? a[i++] : b[j++];

        while (i < a.length)
            answer[k++] = a[i++];

        while (j < b.length)
            answer[k++] = b[j++];

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = new int[sizeArray1];
        for (int i = 0; i < sizeArray1; i++) {
            sortedArray1[i] = scanner.nextInt();
        }
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = new int[sizeArray2];
        for (int i = 0; i < sizeArray2; i++) {
            sortedArray2[i] = scanner.nextInt();
        }
        scanner.close();
        int[] descendingMerge = new int[sizeArray1 + sizeArray2];
        descendingMerge = merge(sortedArray1, sortedArray2);
        for (int i = descendingMerge.length - 1; i >= 0; i--) {
            System.out.println(descendingMerge[i]);
        }

    }
}
