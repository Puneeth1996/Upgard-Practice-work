import java.util.*;

public class Source {
    // Method to print distinct values
    public static void printValues(Map<Integer, String> map) {
        Set<String> anSet = new HashSet<String>();
        map.entrySet().forEach(entry -> {
            anSet.add(entry.getValue());
        });
        // creates Iterator oblect.
        Iterator itr = anSet.iterator();

        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] x) {
        Map<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for (int i = 1; i <= num; i++) {
            key = sc.nextInt();
            value = sc.next();
            map.put(key, value);
            printValues(map);
        }
    }
}
