import java.io.IOException;
import java.util.Scanner;

public class ChooseManager {

    public static void main(String[] args) throws IOException
    {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select C - corporate OR P - private  OR Q-To Quit");
        //input = (char)(System.in.read());
        input = sc.nextLine();



      while(!input.equalsIgnoreCase("Q")) Do :
      {
          if(input.equalsIgnoreCase("C"))
          {
              System.out.println("Manager for corporate vanue is Dustin Britt");
              for (int i = 1; i < 11; ++i) {
                  System.out.println(i);

              }

          }else if(input.equalsIgnoreCase("P"))
          {
              System.out.println("Manager for private vanue is Carmen Lindsey");

          }else if(input.isEmpty())
          {
              System.out.println("Invalid entry: Can not be empty");


          }
          else
          {
              System.out.println("Invalid entry: Select C - Coporate or P- Private OR Q - Quit");
          }

          System.out.println("Select  C - corporate OR P - private OR Q-To Quit");
          input = sc.nextLine();

      }
  }



    }

