class question {
    public static void main(String[] args){

        // Initialize the array with given numbers
        int[] arr = { 87, 23, 23, 2, 1, 4, 5, 6, 54, 3 };

        // Loop starts from index 1 (second element) to the end of the array
        for (int i = 1; i < arr.length; i++) {
            // Check if the current element is less than 35
            if (arr[i] < 35) {
                // Print the element if it is less than 35
                System.out.println("the no are " + arr[i] );
            }

        }
    }
}
