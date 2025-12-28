public class max_elemt_M2 {
    public static void main(String[] args) {
        int[] arr = {2, 44, 5, 43, 23, 42, 4, 34, 13, 34, 23};
        int max = Integer.MIN_VALUE; // Initialize max with the smallest integer value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        System.out.println("The maximum element is: " + max);
    }
}
