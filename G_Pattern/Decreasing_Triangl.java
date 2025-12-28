package G_Pattern;

import java.util.Scanner;

public class Decreasing_Triangl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of Pattern: ");
        int m = sc.nextInt();
     //  int n = sc.nextInt();

        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
// This code prints a decreasing triangle pattern of stars based on the number of rows input by the