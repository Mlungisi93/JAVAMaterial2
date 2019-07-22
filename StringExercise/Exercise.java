package StringExercise;

public class Exercise {
    public static void main(String[] args) {
        // Literal
        String str1 = "Mlungisi";
        String str2 = "Mlungisi";

        String str3 = new String("Mlungisi");
        String  str4 = new String("Mlungisi");

        System.out.println("Comparing Using == oparator");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str2 == str4);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);

        System.out.println("");
        //equals method
        System.out.println("Comparing Using .Equels Method");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        System.out.println("");
        System.out.println("Comparing Using == and intern");
        System.out.println(str2 == str3);
        str3 = str3.intern();

        System.out.println(str2 == str3);

        System.out.println("");
        System.out.println("Compare To");

        String str5 = "Hello";
        String str6 = "hello";
        String str7 = "mello";


        System.out.println(str5.compareTo(str6));
        System.out.println(str6.compareTo(str5));
        System.out.println(str6.compareTo(str7));

        System.out.println("");
        System.out.println("Compatinate");

        String a = "rocket";
        String b = "ship";
        System.out.println(a+b);
        System.out.println(a.concat(b));

        String c ="how long am I";
        if(c.length() == 13)
        {
            System.out.println("I am 13 characters");
        }else
        {
            System.out.println("I don't know my length");
        }
        System.out.println("");
        System.out.println("Trim");
        System.out.println(" hello .equals(hello): "+" hello ".equals("hello"));
        System.out.println(" hello .trim().equals(hello): "+" hello ".trim().equals("hello"));

        System.out.println("");
        String d =  "test me";
        System.out.println("");
        System.out.println("EndsWith");
        System.out.println(d.endsWith("me"));

        System.out.println("");
        System.out.println("Sub String");
        System.out.println(d.substring(0, 4));

        System.out.println("");
        System.out.println("Split ");
        String myString = "Mlungisi Khumalo";
        String[] strArry  = myString.split(" ");

         for (String s: strArry)
         {
             System.out.println(s);
         }
    }
}
