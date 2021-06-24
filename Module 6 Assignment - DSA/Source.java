import java.util.*;

public class Source {
    static PriorityQueue<Integer> min;
    static int k;
    
    static List<Integer> getAllKthNumber(int arr[])
    {
        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            if (min.size() < k)
                min.add(val);
            else {
                if (val > min.peek()) {
                min.poll();
                min.add(val);
                }
            }
            if (min.size() >= k)
                list.add(min.peek());
            else
                list.add(-1);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        int stream[] = new int[n];
        for (int i = 0; i < n; i++) {
            stream[i] = sc.nextInt();
        }
        sc.close();
        min = new PriorityQueue<>();
        List<Integer> res = getAllKthNumber(stream);
        for (int x : res){
            if(x == -1){
                System.out.println("None");
            }
            else{
                System.out.println( k + " largest number is " + x);
            }
        }
    }
}