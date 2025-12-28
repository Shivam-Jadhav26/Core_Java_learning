package Q_marge_sort;

public class b_margeSort {

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Merge Sort (Recursive)
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Split the array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < n - mid; i++) {
            right[i] = arr[i + mid];
        }

        // Recursive sort
        mergeSort(left);
        mergeSort(right);

        // Merge sorted halves into original array
        merge(arr, left, right);
    }

    // Merge two sorted arrays into original array
    public static void merge(int[] original, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge into original array
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                original[k++] = left[i++];
            } else {
                original[k++] = right[j++];
            }
        }

        while (i < left.length) {
            original[k++] = left[i++];
        }

        while (j < right.length) {
            original[k++] = right[j++];
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {2, 5, 48, 53, 13, 96, 8, 9, 34, 67};

        System.out.println("Original array:");
        print(arr);

        mergeSort(arr);

        System.out.println("Sorted array:");
        print(arr);
    }
}
