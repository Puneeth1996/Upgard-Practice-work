import java.util.*;

public class Source {

    // Function to check whether two strings
    // are an anagram of each other
    public static boolean areAnagram(String str1, String str2) {

        HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        // Mapping first string
        for (int i = 0; i < arr1.length; i++) {

            if (hmap1.get(arr1[i]) == null) {

                hmap1.put(arr1[i], 1);
            } else {
                Integer c = (int) hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        // Mapping second String
        for (int j = 0; j < arr2.length; j++) {

            if (hmap2.get(arr2[j]) == null)
                hmap2.put(arr2[j], 1);
            else {

                Integer d = (int) hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }

        if (hmap1.equals(hmap2))
            return true;
        else
            return false;
    }

    // Test function
    // public static void test(String str1, String str2) {

    // System.out.println("Strings to be checked are:\n" + str1 + "\n" + str2 +
    // "\n");

    // // Find the result
    // if (areAnagram(str1, str2))
    // System.out.println("The two strings are " + "anagrams of each other\n");
    // else
    // System.out.println("The two strings are not" + " anagrams of each other\n");
    // }

    // Method to sort the character array
    public static void arrange(char[] ch) {
        // Write your code here
    }

    public static void main(String[] x) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for (int i = 1; i <= num; i++) {
            key = sc.next();
            value = sc.next();
            map.put(key, value);
        }
        // Write your code here
        // using for-each loop for iteration over Map.entrySet()
        boolean flag = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (areAnagram(entry.getKey(), entry.getValue())) {
                System.out.println(entry.getKey() + " " + " : " + " " + entry.getValue());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(flag);
        }
    }
}
