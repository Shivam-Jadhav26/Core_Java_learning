package D_For_loop;
public class Break {
    public static void main(String[] args) {
        // Using break statement in a for loop
        System.out.println("Using break statement in a for loop:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }

        // Using break statement in a while loop
        System.out.println("\nUsing break statement in a while loop:");
        int j = 1;
        while (j <= 10) {
            if (j == 5) {
                break; // Exit the loop when j is 5
            }
            System.out.println(j);
            j++;

            // Note: In a do-while loop, break is not typically used as it is designed to execute at least once.

            //some special case while loop and for loop can be used with break statement
        }
    }
}
