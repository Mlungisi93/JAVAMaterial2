
public class Scope {

    private int myInt = 2;

    public static void main(String[] args) {

        Scope scope = new Scope();
        System.out.println("myInt = "+scope.myInt);
        scope.printMyInt(4);
    }

    /**
     * Check out the different parts of a method
     */
    public void printMyInt(int myInt)
    {
        int aSecondInt = 3;
        System.out.println("myInt = "+myInt);
        System.out.println("myInt = "+this.myInt);

        {
            int aThirdInt = 5;
            System.out.println("aSecondInt = "+aSecondInt);
            System.out.println("aThirdInt = "+aThirdInt);
        }

        System.out.println("aSecondInt = "+aSecondInt);
    }

}
