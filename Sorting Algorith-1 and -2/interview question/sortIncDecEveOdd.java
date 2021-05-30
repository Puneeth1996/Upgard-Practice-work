import java.util.Scanner;
import java.util.*;

public class sortIncDecEveOdd {
    static void sortIncDec(int arr[], int n) {
        Vector<Integer> odd_indexes = new Vector<Integer>();
        Vector<Integer> even_indexes = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                odd_indexes.add(arr[i]);
            else
                even_indexes.add(arr[i]);

        }
        Collections.sort(odd_indexes);
        Collections.sort(even_indexes);

        for (int i = 0; i < odd_indexes.size(); i++)
            System.out.print(odd_indexes.get(i) + " ");
        // System.out.println("");
        for (int i = 0; i < even_indexes.size(); i++)
            System.out.print(even_indexes.get(i) + " ");

    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        sortIncDec(arr, n);
    }
}