import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class tes {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromEnd(queue);
    }

    // Method to print the fifth element from the tail of the queue
    static void printFifthElementFromEnd(Queue<Integer> queue) {
        // Write your code here
        if (queue.size() > 5) {
            int val = queue.size() - 5;
            while (val-- > 0) {
                queue.remove();
            }
            System.out.println(queue.peek());
        } else {
            System.out.println("There are not enough elements in the queue");
        }
    }
}