import java.util.*;

public class Source {

    public static void findItinerary(Map<String, String> dataSet)
    {
        Map<String, String> reverseMap = new HashMap<String, String>();
        for (Map.Entry<String,String> entry: dataSet.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());
        String start = null;
        for (Map.Entry<String,String> entry: dataSet.entrySet())
        {
            if (!reverseMap.containsKey(entry.getKey()))
            {
                start = entry.getKey();
                break;
            }
        }
        if (start == null)
        {
        System.out.println("Invalid Input");
        return;
        }
        String to = dataSet.get(start);
        while (to != null)
        {
            System.out.print(start +  "->" + to + "\n");
            start = to;
            to = dataSet.get(to);
        }
    }

    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            tickets.put(sc.next(),sc.next());
        }
        findItinerary(tickets);
        sc.close();
    }
}