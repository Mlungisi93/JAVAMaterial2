public class funTest {

    public static void fun(Object ...a)
    {
        for(Object s: a)
        {
            System.out.println(s+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        fun("first", "second",12, true);
    }
}
