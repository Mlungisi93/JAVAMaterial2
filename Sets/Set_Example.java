package Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example {
    public static void main(String[] args) {
        // Set deonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();
        //add comes from Collector interface
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.print("Set output without the duplicates");


        System.out.println(hash_Set);
        System.out.println("Check if there is Geeks: "+hash_Set.contains("Geeks"));//true
        System.out.println(hash_Set.isEmpty());
        System.out.println(hash_Set.size());


        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);


    }
}
