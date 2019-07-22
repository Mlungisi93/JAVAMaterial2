import java.io.IOException;
import java.util.Scanner;

public class UserInitials {
    public static void main(String[] args) throws IOException
    {
        char first;
        char second;
        char third;

        System.out.print("Please Enter Your Initials: ");

            first = (char)System.in.read();
        second = (char)System.in.read();
        third = (char)System.in.read();


        System.out.println("You Have Entered: "+first+ ","+second+","+third);
    }
}
