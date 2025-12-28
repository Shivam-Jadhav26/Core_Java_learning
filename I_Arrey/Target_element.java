import java.util.Scanner;
public class Target_element {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take target element input from user
        System.out.println(" Enter the target element ");
        int t = sc.nextInt();

        // Take array size input from user
        System.out.println("Enter the size of arr");
        int n = sc.nextInt();

        // Declare array with given size
        System.out.println(" Enter the element in the arr");
        int[] arr = new int[n]; 
        
        // Input array elements from user
        for(int i= 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Search for target element in array
        // NOTE: This loop starts from 1, which will skip arr[0] and may cause ArrayIndexOutOfBoundsException at arr[arr.length]
        for (int i = 1; i <=arr.length; i++) {
            // Check if current element matches target
            if (arr[i]==t){
                System.out.println("The target is found");
            }
        }
        // Close the scanner
        sc.close();
    }
}
