import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the
    // stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        int n = stack.size();
        Stack<Integer> stack2 = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int k;
        if (n % 2 == 0) {
            k = n / 2;
        } else {
            k = n / 2 + 1;
        }
        while (count != k) {
            stack2.add(stack.pop());
            count++;
        }
        while (!stack2.isEmpty()) {
            list.add(stack2.pop());
        }
        System.out.println(list);
    }
}