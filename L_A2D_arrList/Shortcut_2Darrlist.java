package L_A2D_arrList;
import java.util.ArrayList;

public class Shortcut_2Darrlist {
    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();

        // Add new rows
        arr2D.add(new ArrayList<>()); // Add first row
        arr2D.add(new ArrayList<>()); // Add second row

        // Add elements to rows
        arr2D.get(0).add(10); // Add 10 to first row
        arr2D.get(0).add(20); // Add 20 to first row
        arr2D.get(1).add(30); // Add 30 to second row

        // Set element in a row
        arr2D.get(0).set(1, 99); // Set second element of first row to 99

        // Remove element from a row
        arr2D.get(1).remove(0); // Remove first element from second row

        // Add another row with values
        ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(100);
        newRow.add(200);
        arr2D.add(newRow);

        // Print all rows and elements
        System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : arr2D) {
            System.out.println(row);
        }

        // Get size of 2D ArrayList (number of rows)
        System.out.println("Number of rows: " + arr2D.size());

        // Get size of first row (number of columns)
        if (!arr2D.isEmpty()) {
            System.out.println("Number of columns in first row: " + arr2D.get(0).size());
        }

        // Check if a value exists in a row
        boolean contains99 = arr2D.get(0).contains(99);
        System.out.println("First row contains 99: " + contains99);

        // Clear all elements from a row
        arr2D.get(0).clear();
        System.out.println("After clearing first row: " + arr2D);

        // Check if a row is empty
        System.out.println("Is first row empty? " + arr2D.get(0).isEmpty());
    }
}
