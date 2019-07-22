
public class Constructors {

    int count;
    String name;
    boolean isTrue;


    public static void main(String[] args) {
        Constructors c = null;

        c = new Constructors(5);
        System.out.println("count = "+c.count+", name = "+c.name+", isTrue = "+c.isTrue);

        c = new Constructors(6, "Ryan Greenwood");
        System.out.println("count = "+c.count+", name = "+c.name+", isTrue = "+c.isTrue);

        c = new Constructors(7, "John Deere", true);
        System.out.println("count = "+c.count+", name = "+c.name+", isTrue = "+c.isTrue);

    }


    public Constructors(int count){
        this.count = count;
    }

    public Constructors(int count, String name){
        this.count = count;
        this.name = name;
    }

    public Constructors(int count, String name, boolean isTrue){
        this.count = count;
        this.name = name;
        this.isTrue = isTrue;
    }

}
