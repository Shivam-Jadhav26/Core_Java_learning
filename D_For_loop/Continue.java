package D_For_loop;
public class Continue {

    public static void main(String[] args) {
        // Using continue statement in a for loop
        System.out.println("Using continue statement in a for loop:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip the iteration when i is 5
            }
            System.out.println(i);
        }

        // Using continue statement in a while loop
        System.out.println("\nUsing continue statement in a while loop:");
        int j = 1;
        while (j <= 10) {
            if (j == 5) {
                j++; // Increment j to avoid infinite loop
                continue; // Skip the iteration when j is 5
            }
            System.out.println(j);
            j++;

            //in do while loop continue statement is not used
        }
    }
    
}
