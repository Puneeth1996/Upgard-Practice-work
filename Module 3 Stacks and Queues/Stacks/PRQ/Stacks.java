import java.util.Scanner;
import java.util.Stack;

// Input 1:
// 1 2 3

// 1 4 2 5 3

// Output 1:
// true

// Input 2:
// 1 2 3

// 1 2 4 5

// Output 2:
// false

// Input 3:
// 1 2 3

// 3 2 1

// Output 3:
// false

public class Stacks {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        // first check which is the great sequence stack
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}
