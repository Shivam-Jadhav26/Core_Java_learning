package L_A2D_arrList;
import java.util.ArrayList;

public class D_2D_arrList {
    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();

        // Add rows and elements
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add((i + 1) * (j + 1));
            }
            arr2D.add(row);
        }

        // Print the 2D ArrayList
        System.out.println("Original 2D ArrayList:");
        for (ArrayList<Integer> row : arr2D) {
            System.out.println(row);
        }

        // Add a new row
        ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(100);
        newRow.add(200);
        arr2D.add(newRow);
        System.out.println("\nAfter adding a new row:");
        for (ArrayList<Integer> row : arr2D) {
            System.out.println(row);
        }

        // Add an element to an existing row
        arr2D.get(0).add(999);
        System.out.println("\nAfter adding 999 to first row:");
        for (ArrayList<Integer> row : arr2D) {
            System.out.println(row);
        }

        // Remove an element from a row
        arr2D.get(1).remove(2); // Remove element at index 2 from second row
        System.out.println("\nAfter removing element at index 2 from second row:");
        for (ArrayList<Integer> row : arr2D) {
            System.out.println(row);
        }

        // Get a specific element
        int value = arr2D.get(2).get(1); // Get element at row 2, column 1
        System.out.println("\nElement at row 2, column 1: " + value);
    }
}
