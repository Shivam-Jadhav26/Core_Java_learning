package O_Searching;

public class b_lowerbond_binnery {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 9, 11, 44, 66, 88, 99};
        int l = arr.length;

        int high = l - 1;
        int low = 0;
        int lb = l;  // Default to 'not found'

        int target = 34;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] >= target) {
                lb = Math.min(mid, lb);  // Possible lower bound
                high = mid - 1;   
                System.out.println("ringa");       // Try to find smaller valid index
            } else {
                low = mid + 1;           // Move right
            }
        }

        System.out.println("Lower Bound Index: " + lb);
        if (lb < l) {
            System.out.println("Lower Bound Value: " + arr[lb]);
        } else {
            System.out.println("No element ≥ target found");
        }
    }
}
