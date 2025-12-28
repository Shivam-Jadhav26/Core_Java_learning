public class max_elemt {
    
    public static void main(String[] args) {
        int[] arr = {2, 44, 5, 43, 23, 42, 4, 34, 13, 34, 23};
        int max = arr[0]; // Initialize max with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        System.out.println("The maximum element is: " + max);
    }
}
