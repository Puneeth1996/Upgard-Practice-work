import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Source {

    private static final int capacity = 3;
    Character arr[] = new Character[capacity];
    int size = 0;
    int top = -1;
    int rear = 0;

    public void enqueue(Character pushedElement) {
        if (top < capacity - 1) {
            top++;
            arr[top] = pushedElement;
        } else {
            System.out.println("Overflow !");
        }

    }

    public Character dequeue() {
        Character c = arr[rear];
        if (top >= rear) {
            rear++;
        } else {
            System.out.println("Underflow !");
        }
        return c;
    }

    private LinkedList<Character> linklist = new LinkedList<Character>();

    public void push(Character item) {
        linklist.addFirst(item);
    }

    public Character pop() {
        if (linklist.size() <= 0)
            System.out.println("Empty Stack");
        return linklist.removeFirst();
    }

    public Character top() {
        return linklist.getFirst();
    }

    boolean test(String candidate) {
        char ch;
        int length = candidate.length(), numLetters = 0, charCount;

        char fromStack, fromQueue;
        boolean stillPalindrome;

        for (int i = 0; i < length; i++) {
            ch = candidate.charAt(i);
            if (Character.isLetter(ch)) {
                numLetters++;
                ch = Character.toLowerCase(ch);
                push(ch);
                enqueue(ch);
            }
        }

        stillPalindrome = true;
        charCount = 0;
        while (stillPalindrome && (charCount < numLetters)) {
            fromStack = (Character) top();
            pop();
            fromQueue = dequeue();
            if (fromStack != fromQueue)
                stillPalindrome = false;
            charCount++;
        }

        return stillPalindrome;
    }

    public static void main(String[] args) {
        Source obj = new Source();
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        if (obj.test(inputString))
            System.out.println("'" + inputString + "' is a palindrome.");
        else
            System.out.println("'" + inputString + "' is NOT a palindrome.");
    }
}
