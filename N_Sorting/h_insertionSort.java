package N_Sorting;

public class h_insertionSort {

    // Function to print the array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Insertion Sort function
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];    // Current element to be inserted
            int j = i - 1;

            // Move elements that are greater than current to one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j]; // Shift element right
                j--;                 // Move to previous element
            }

            arr[j + 1] = current; // Place current at correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        System.out.println("Before Sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
