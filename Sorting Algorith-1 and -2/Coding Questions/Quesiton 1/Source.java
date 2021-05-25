import java.util.Scanner;

import java.util.Arrays;

class source {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }
        Arrays.sort(array2);
        int can_replace = 0;
        int replace_number_from_array2 = 0;
        for (int i = 0; i <= n1 - 2; i++) {
            if (!(array1[i] < array1[i + 1])) {
                for (int j = 0; j < n2; j++) {
                    if ((array1[i] < array2[j]) && (array2[j] < array1[i + 2])) {
                        can_replace = 1;
                        replace_number_from_array2 = array2[j];
                    }
                }
            }

        }
        if (can_replace == 1) {
            System.out.println(replace_number_from_array2);
        } else {
            System.out.println("Not Possible");
        }
    }
}
