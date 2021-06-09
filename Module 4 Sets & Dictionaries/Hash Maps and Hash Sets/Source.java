import java.util.Scanner;

class Source {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        // store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }

        // write your code here
    }
}
