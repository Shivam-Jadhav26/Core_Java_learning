package D_For_loop;
import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to print 'Hello World': ");
        int n = sc.nextInt();

        // While loop
        System.out.println("\nUsing while loop:");
        int i = 1;
        while (i <= n) {
            System.out.println("Hello World " + i);
            i++;
        }

        // Do-while loop
        System.out.println("\nUsing do-while loop:");
        int j = 1;
        do {
            System.out.println("Hello World " + j);
            j++;
        } while (j <= n);

        // For loop
        System.out.println("\nUsing for loop:");
        for (int k = 1; k <= n; k++) {
            System.out.println("Hello World " + k);
        }

        // For-each loop
        System.out.println("\nUsing for-each loop:");
        String[] greetings = new String[n];
        for (int m = 0; m < n; m++) {
            greetings[m] = "Hello World " + (m + 1);
        }
        for (String greeting : greetings) {
            System.out.println(greeting);
        }

        sc.close();
    }
}
// This code demonstrates the use of different types of loops in