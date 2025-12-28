public class questin {
    public static void main(String[] args) {
        // Initialize the array with given elements
        int[] arr  = {2,44,5,43,23,42,4,34,13,34,23};
        int sum = 0 ;

        // Start from index 1 to skip the first element (arr[0])
        for (int i = 1 ; i < arr.length; i++) {
            sum += arr[i]; // Add each element to sum
        }

        // Print the sum of all elements except the first one
        System.out.println("the sum is "+ sum);
        
        
    }
}
