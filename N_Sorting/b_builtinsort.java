package N_Sorting;

import java.util.Arrays;

public class b_builtinsort {

    public static void main(String[] args) {

        int[] arr = { 2, 6, 8, 3, 9, 5, 9 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "sorted one");
        Arrays.sort(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
