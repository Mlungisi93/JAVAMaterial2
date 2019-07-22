public class cmdline {
   private double price;
   private String name;
   private float cash;
   private boolean isValid;
   private int number;
 static String result ="";

    {result +="c";}
    static { result +="u"; }
    { result +="r"; }
    public static void main(String[] args)
    {

cmdline cmd = new cmdline();

        final char a = 'A', d='D';
        char grade = 'B';
        switch (grade)
        {
            case a:
            case 'B':System.out.print("great"); // break;
            case 'C': System.out.print("good\n"); break;
            case  d:
            case 'F': System.out.println("not good");
        }
        int m = 9, n=1, x=0;
        while (m > n)
        {
            m--;
            n += 2;
            x += m +n;
        }
        System.out.println(x);
        boolean test = true;
        boolean test2 = false;
        System.out.println(test == test2); // false
        System.out.println(!test2); // true

        int c = 7, result = 4;
        result = result+ c; // result--c;
        System.out.println(result);

        int y = 5 * 4 % 3;
        System.out.println(y);
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = (String.valueOf(numFish)) +1; //String anotherFish = numFish +1
        //can complile int to string
        System.out.println(anotherFish + " "+ fishType);
        System.out.println(numFish +" "+ 1);

        String s = "Hello";
        double bodmas = 20 % 3 * 2;
        System.out.println(bodmas);
        String str = "Hello";
        String t = new String("Hello");
        if(s =="Hello")
            System.out.println(t);
        if(t == "Hello")
        {
            System.out.println("It works too!");
        }

        String letters = "012345678";
        System.out.println(letters.substring(1,3));
        System.out.println(letters.substring(7,8));
        System.out.println(letters.substring(7));
        System.out.println(Character.isWhitespace('A'));
  String s1 = "java";
  StringBuilder obStringBuilder = new StringBuilder("java");
  //can't compare string buffer to a string
  if(s1.equals(obStringBuilder))
  {
      System.out.println("2");
  }

        System.out.println("this is it"+howMany(true,true,true,true));

        System.out.println(cmdline.result +"");


        System.out.println(cmdline.result +"");
        Object obj = new Integer(3);
        String str2 = (String)obj                                                                                                                                                                                                                                               ; // error when casting but (String.valueOf(obj));
        System.out.println(str2);

    }

    public static int howMany(boolean b, boolean ...b2)
    {
        return b2.length;
    }



}
