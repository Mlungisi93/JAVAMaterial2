
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IncrLoop {

    public static void main(String[] args) {

        int a=5, b=10, i;

        System.out.println("a++ on a line = "+(a++)+" followed by ++a on the same line = "+(++a));

        System.out.println("b-- on a line = "+(b--)+" followed by --b on the same line = "+(--b));

        System.out.println("Increment...");
        myIncrementLoop();
        System.out.println("\nDecrement...");
        myDecrementLoop();
        System.out.println("\nBye!");

    }

    public static void myIncrementLoop(){

        int count = 0;

        while(count < 3) { Do:
            ++count;
            System.out.println("Increment count = "+count);
        }
    }

    public static void myDecrementLoop(){

        int count = 3;

        while(count > 0){
            --count;
            System.out.println("Decrement count = "+count);
        }
    }



}
