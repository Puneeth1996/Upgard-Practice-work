public class Parenthesis1 {
    /*
     * NOTE ----
     */
    public static boolean match(String parens) throws Exception {
        int count = 0;
        char[] chars = parens.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            } else {
                throw new Exception("Invalid character " + c);
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println(match(in.nextLine()));
        } catch (Exception e) {
            // catch the exception thrown by the method match() in try block;
            // e.getMessage() will get the exception message
            System.out.println(e.getMessage());
        }
    }
}
