package D_For_loop;
import java.util.Scanner;
public class Forloop {
    
    public static void main(String[] args) {
        //print numbers from 1 to n using a for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        // Using a for loop to print numbers from 1 to n
        System.out.print("Using for loop to print numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Calculate the sum of numbers from 1 to n using a for loop
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        sc.close();

    }
}
