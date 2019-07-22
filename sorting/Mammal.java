package sorting;

public class Mammal {
    public Mammal(int a)
    {

        System.out.print("Mammal");
    }
    public void print()
    {
        System.out.println("hello");
    }

}

class Playpus extends Mammal {
    public Playpus(int a)
    {
        super(a);
        System.out.print("Playpus");
    }

    public Playpus(int b, int c){
        super(b);
        System.out.println(c)
        ;
    }
}


