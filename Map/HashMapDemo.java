package Map;

// Java program to demonstrate working of Map interface
import java.util.*;
class HashMapDemo
{
    public static void main(String args[])
    {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

        Map< String,Integer> hm =
                new HashMap< String,Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        // Returns Set view
        Set<Map.Entry<String,Integer>>  st = hm.entrySet();

        for (Map.Entry< String,Integer> me:st)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
    }
}