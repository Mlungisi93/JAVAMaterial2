package Sets;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set_Example {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);

        // Create a hash set
        Set<String> set = new HashSet<>();
        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        // Display the elements in the hash set
        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");
        }
        System.out.println();
        // Process the elements using the forEach method
        set.forEach(e -> System.out.print(e.toLowerCase() + " "));

        System.out.println("set is " + set);
        System.out.println(set.size() + " elements in set1");
// Delete a string from set1
        set.remove("London");
        System.out.println("\nset is " + set);
        System.out.println(set.size() + " elements in set");
// Create set2
        java.util.Set<String> set2 = new java.util.HashSet<>();
// Add strings to set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("\nset2 is " + set2);
        System.out.println(set2.size() + " elements in set2");
        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));
        set.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set);
        set.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is " + set);
        set.retainAll(set2);
        System.out.println("After removing common elements in set2 "
                + "from set1, set1 is " + set);

    }
}
