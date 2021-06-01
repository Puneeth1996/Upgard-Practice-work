import java.util.*;

// You are given a stack with n integers and you need to print the fifth element from the bottom of the stack.
public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        // System.out.println(stack.size());
        // if (stack.size() <= 5) {
        // System.out.println("There are not enough elements in the stack");
        // return;
        // }

        // else {
        // // This some text written from the vim editor
        // int x = stack.peek();
        // System.out.println(stack + " ");
        // stack.pop();
        // // printFifthElementFromStart(stack);
        // System.out.println(stack + " ");
        // stack.push(x);
        // }

        if (stack.size() <= 5) {
            System.out.println("There are not enough elements in the stack");
            return;
        }
        while (!(stack.size() <= 5)) {
            stack.pop();
        }
        // System.out.println(stack + " ");
        System.out.println(stack.pop());

    }
}
