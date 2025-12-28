// import java.util.Arrays;

// This class demonstrates copying an array using a for loop
public class copy_Arrby_for {
    public static void main(String[] args){

        // Original array initialization
        int[] arr = {27,23,32,4,6,77,67,4,5,23,43,45576,};

        // Print all elements of the original array
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }

        // Print a separator line
        System.out.println("\n" + " ye niche brr hai");

        // Create a new array of the same length as arr
        int[] brr = new int[arr.length];

        // Copy each element from arr to brr using a for loop
        for (int i = 0 ; i < arr.length ; i ++){
            brr[i] = arr[i];
            System.out.print(brr[i] + " ");
        }
    }
}
