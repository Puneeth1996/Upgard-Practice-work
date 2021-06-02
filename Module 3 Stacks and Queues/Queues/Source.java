import java.util.*;

class Source {

    // Function to find duplicate parenthesis in a
    // balanced expression
    static String findDuplicateParenthesis(String s) {
        // create a stack of characters
        Stack<Character> Stack = new Stack<>();

        // Iterate through the given expression
        char[] str = s.toCharArray();
        for (char ch : str) {
            // if current character is close parenthesis ')'
            if (ch == ')') {
                // pop character from the stack
                char top = Stack.peek();
                Stack.pop();

                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return "Input string contains duplicate parenthesis";
                }
            } // push open parenthesis '(', operators and
              // operands to stack
            else {
                Stack.push(ch);
            }
        }

        // No duplicates found
        return "Input string does not contain duplicate parenthesis";
    }

    public static void main(String[] args) {
        Source obj = new Source();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));

    }

}
