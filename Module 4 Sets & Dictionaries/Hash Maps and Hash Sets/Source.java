import java.util.HashMap;
import java.util.Scanner;

class Source {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        // number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here
        HashMap<Integer, Integer> hasM = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int frst = arr[i][0];
            int sec = arr[i][1];
            Integer data = hasM.get(sec);
            if (data != null && data == frst) {
                System.out.println(sec + " " + frst);
                flag = true;
            } else {
                hasM.put(frst, sec);
            }
        }
        if (!flag) {
            System.out.println("No Symmetric pair");
        }

    }
}
