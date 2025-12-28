
package J_Arrey_list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an empty ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        // var list = new ArrayList<>();    ye bhi valid hai or ye modern method hai for areey list 
        // ye auto detect karta hai type ko so more helpfull hsi 

// Add elements to the ArrayList
list.add(10);
list.add(20);
list.add(30);
// Now list contains: [10, 20, 30]


// Access element at index 1 (second element)
int value = list.get(1); // value is 20
System.out.println("Element at index 1: " + value);

// Remove element at index 0 (first element)
list.remove(0);
// Now list contains: [20, 30]
System.out.println("After removing index 0: " + list);

// Change value at index 1 to 99
list.set(1, 99);
// Now list contains: [20, 99]
System.out.println("After updating index 1: " + list);

// Check if 20 is in the list
boolean exists = list.contains(20);
System.out.println("Contains 20? " + exists);

// Get number of elements in the list
int size = list.size();
System.out.println("Size of ArrayList: " + size);


// Print all elements using for-each loop
for (int num : list) {
    System.out.print(num + " ");
}
System.out.println();


// Remove all elements from the list
list.clear();
System.out.println("After clearing: " + list); // Output: []


    }
}

