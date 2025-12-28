package J_Arrey_list;

import java.util.ArrayList;

public class Arrey_list {
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

        // Print the ArrayList after removal
        System.out.println("After removing index 0: " + list);
    }
}
