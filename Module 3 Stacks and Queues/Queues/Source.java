import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Source {

    /* implementing queue using linked list */
    Queue<Integer> q = new LinkedList<Integer>();

    // Push operation
    void push(int val) {
        // get previous size of queue
        int size = q.size();

        // Add current element
        q.add(val);

        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element
        for (int i = 0; i < size; i++) {
            // this will add front element into
            // rear of queue
            int x = q.remove();
            q.add(x);
        }
    }

    // Removes the top element
    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
        }
        int x = q.remove();
        return x;
    }

    // Returns top of stack
    int top() {
        if (q.isEmpty())
            return -1;
        else
            return q.peek();
    }

    public static void main(String[] args) {
        Source obj = new Source();
        Scanner in = new Scanner(System.in);

        /* Enter the number of elements you want to add in the stack */

        int n = in.nextInt();

        /* Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
        }
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());

    }
}