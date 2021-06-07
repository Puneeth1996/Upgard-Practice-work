import java.util.*;

public class Search {
    public static void main(String[] args) {
        String[] emails = { "chandler.bing@xyz.com", "ross.geller@xyz.com", "rachel.greene@xyz.com",
                "joey.tribbiani@xyz.com", "monica.geller@xyz.com", "phoebe.buffay@xyz.com", "sheldon.copper@xyz.com",
                "marie.george@xyz.com" };

        String NewEmail = "monica.geller@xyz.com";

        // Write your code here
        System.out.println(binarySearch(emails, NewEmail, emails.length));
    }

    // Returns index of x if it is present in arr[],
    // else return -1
    public static int binarySearch(String arr[], String x, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
