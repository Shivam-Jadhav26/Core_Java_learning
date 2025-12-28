package J_Arrey_list;

import java.util.ArrayList;

public class arrey_i_advence {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Print all elements in the ArrayList
        System.out.println("ArrayList elements: " + list);

        // Access an element by index
        System.out.println("Element at index 1: " + list.get(1));

        // Remove an element
        list.remove(0);
        System.out.println("After removing index 0: " + list);

        // Add more elements
        list.add(40);
        list.add(50);

        // Change an element
        list.set(1, 99); // Set index 1 to 99
        System.out.println("After setting index 1 to 99: " + list);

        // Check if an element exists
        System.out.println("Contains 30? " + list.contains(30));

        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // Iterate using for-each loop
        System.out.print("Iterating: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clear all elements
        list.clear();
        System.out.println("After clearing: " + list);
    }
}