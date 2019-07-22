import java.util.InputMismatchException;
import java.util.Scanner;

public class AcceptIntegers {

    public static void main(String[] args)
    {
        boolean isMaximum = true;
        int input;
        final int MAX = 3;
        int[] values = new int[MAX];
       int count = 0;
        Scanner sc =  new Scanner(System.in);
        while(isMaximum)
        {
            try
            {
                if(count > values.length -1)
                {
                    isMaximum = false;
                }else
                {
                    System.out.print("Enter "+(count+1)+" Number:");
                    values[count] = sc.nextInt();
                    count++;
                }

            }catch(InputMismatchException ex)
            {
                System.out.println("Invalid value entered!");
                sc.next();
            }
        }

        for (int i = 0; i <  values.length; i++) {
            System.out.println(values[i]);

        }
    }
}
