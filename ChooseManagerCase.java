import java.io.IOException;

public class ChooseManagerCase {

    public static void main(String[] args) throws IOException
    {
        char input;
        System.out.println("Select C - corporate OR P - private");
        input = (char)(System.in.read());

switch (input)
{
    case 'C' : System.out.println("Dustin Britt");
    break;
    case 'c' : System.out.println("Dustin Britt");
        break;
    case 'P' :  System.out.println("Carmen Lindsey");

        break;
    case 'p' :System.out.println("Carmen Lindsey");
        break;
    case 'N' :System.out.println("Peter Khumalo");
        break;
    case 'n' :System.out.println("Peter Khumalo");
        break;
        default:System.out.println("Invalid entry: Select C or P");

}

    }
}
