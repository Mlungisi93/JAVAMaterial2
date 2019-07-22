package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        set.add("Vijey");
        set.add("Ravi");
        set.add("Vija");
        set.add("Aja");
        set.add("Vije");
        set.add("Ravi");
        set.add("Vij");
        set.add("Aj");
        set.add("Vij");
        TreeSet<String> set2 = new TreeSet<String>(set);
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i = set2.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
