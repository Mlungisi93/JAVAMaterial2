package Sets;

import java.util.*;
public class LinkedHashSetExample {

    public static void main(String[] args) {
        //Creating HashSet and adding elements
        LinkedHashSet<String> set = new LinkedHashSet();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
       set.add("Ajay");
        Iterator<String> i = set.iterator();
        while (i.hasNext())  {
            System.out.println(i.next());
        }
    }
}
