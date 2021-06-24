import java.util.*;

public class Source {

    public static int search(int arr[], int t)
    {
        ArrayList<Integer> clist = new ArrayList<>();

        for (int i : arr)
            clist.add(i);

        return clist.indexOf(t);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int i = search(arr, key);
        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}