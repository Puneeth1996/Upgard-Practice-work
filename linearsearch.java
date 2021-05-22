public class LinearSearchExample {
    public static int count = 0;

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] == key) {
                return count;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        int[] a1 = { 10, 20, 30, 50, 70, 90 };
        int key = 50;
        System.out.println(key + " is found at index: " + linearSearch(a1, key));
    }
}
