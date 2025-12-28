package G_Pattern;

import java.util.Scanner;

public class AlphabetSquare {
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of Pattern: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

   

