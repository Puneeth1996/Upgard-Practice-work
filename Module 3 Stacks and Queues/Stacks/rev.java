import java.util.Scanner;
import java.util.*;

// You are given a string and you have to print the reverse of the string using
// a stack
public class rev {

    public static void main(String arg[]) {
        Stack<Character> stack = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] reverseString = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()) {
            reverseString[i++] = stack.pop();
        }
        System.out.println(reverseString);

    }tem.out.println(reverseString);
    }}
