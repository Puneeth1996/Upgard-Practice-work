import java.util.*;
import java.util.Scanner;

class prac {
    public static void main(String[] args) {
        Hashtable<Integer, String> boardingPass = new Hashtable<Integer, String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : arr) {
            if (!boardingPass.containsKey(i)) {
                boardingPass.put(i, "Checked");
            } else {
                System.out.println("This is a duplicate Boarding Pass Number" + i);
            }
        }
    }
}
