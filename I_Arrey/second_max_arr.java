public class second_max_arr {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Variables to store the largest and second largest values
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        // Traverse the array to find first and second maximum
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than first_max, update both first_max and second_max
            if (arr[i] > first_max) {
                second_max = first_max; // previous max becomes second max
                first_max = arr[i];     // update first max
            } 
            // If current element is less than first_max but greater than second_max and not equal to first_max
            else if (arr[i] > second_max && arr[i] != first_max) {
                second_max = arr[i];    // update second max
            }
        }
        // If second_max was never updated, there is no second maximum
        if (second_max == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element in the array.");
        } else {
            System.out.println("The second maximum element in the array is: " + second_max);
        }
    }
}
