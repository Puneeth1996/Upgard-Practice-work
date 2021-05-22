import java.util.*;

class Source {

    public static int count = 0;

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(linearSearch(array, key));
    }
}
