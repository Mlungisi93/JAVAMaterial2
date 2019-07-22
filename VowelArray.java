import java.util.Scanner;

public class VowelArray {
 static final String[] vowelCharacters = {"a","e", "i", "o", "u"};

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter an alphabet: ");
        String value = input.nextLine();
        if(search(value))
        {
            System.out.println(value+" is a vowel");
        }else
        {
            System.out.println(value +" is not a vowel");
        }

    }

    public static boolean search(String searchValue)
    {
      for (String s : vowelCharacters)
      {
          if(s.equalsIgnoreCase(searchValue))
          {
              return true;
          }
      }

      return false;
    }
}
