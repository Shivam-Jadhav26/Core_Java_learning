import java.util.Scanner;

class arr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of arr");
    

        int n = sc.nextInt();
        int[] arr = new int[n]; // Initialize array with size n

        // Use 0-based indexing for arrays in Java
          System.out.println("Enter the no in arr");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }

        sc.close();
    }
}
