package K_A2D_arrey;

import java.util.Scanner;

public class rolln_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array: rows for students, columns for roll no and marks
        int[][] data = new int[n][2];

        // Input roll numbers and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            data[i][0] = sc.nextInt();
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            data[i][1] = sc.nextInt();
        }

        // Print roll numbers and marks
        System.out.println("\nRoll No\tMarks");
        for (int i = 0; i < n; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }

        sc.close();
    }
}
