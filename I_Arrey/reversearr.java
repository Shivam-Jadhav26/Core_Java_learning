public class reversearr {
    public static void main(String[] args) {
        int[] arr = {45, 6786, 3, 2, 1, 1, 23, 4, 5, 65, 6};

        // Two pointer approach to reverse the array
        int left = 0; // Start pointer
        int right = arr.length - 1; // End pointer

        while (left < right) {
            // Swap elements at left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
