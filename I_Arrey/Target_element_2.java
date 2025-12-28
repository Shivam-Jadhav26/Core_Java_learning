import java.util.Scanner;
public class Target_element_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take target element input from user
        System.out.println("Enter the target element");
        int t = sc.nextInt();

        // Take array size input from user
        System.out.println("Enter the size of arr");
        int n = sc.nextInt();

        // Declare array and take elements input from user
        System.out.println("Enter the elements in the arr");
        int[] arr = new int[n]; 
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store each input in array
        }

        // Search for the target element in the array
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) { // If current element matches target
                found = true;
                break; // Exit loop once target is found    
            }
        }

        // Print result based on search
        if (found == true) {
            System.out.println("Target is found");
        } else {
            System.out.println("Target not found");
        }

        sc.close(); // Close the scanner
    }
}
