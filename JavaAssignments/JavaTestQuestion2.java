package JavaAssignments;

import java.util.Scanner;

public class JavaTestQuestion2 {
    private static String input;
    private static String option;
    private static String firstArgument;
    private static String secondArgument;
    private static int length;
    private static boolean isQuit = false;

    public static void main(String[]args)
    {
        while(isQuit == false)
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Here: ");
            input = sc.nextLine();
            separateString(input);
            if(option == null)
            {
                System.out.println("Input can't be empty");
            }else
            {
                switch (option.toLowerCase())
                {
                    case "odd":
                        try
                        {
                            int number = Integer.parseInt(firstArgument);
                            if(length > 2)
                            {
                                System.out.println("Only Two Parameters are accepted for this option eg odd 1");
                            }else
                            {
                                odd(number);
                            }
                        }catch (NumberFormatException ex)
                        {
                            System.out.println("Invalid value: only int accepted!");
                        }
                        break;

                    case "even":
                        try
                        {
                            int number = Integer.parseInt(firstArgument);
                            if(length > 2)
                            {
                                System.out.println("Only Two Parameters are accepted for this option eg odd 1");
                            }else
                            {
                                even(number);
                            }
                        }catch (NumberFormatException ex)
                        {
                            System.out.println("Invalid value: only int accepted!");
                        }
                        break;

                    case "square":
                        try
                        {
                            int number = Integer.parseInt(firstArgument);
                            if(length > 2)
                            {
                                System.out.println("Only Two Parameters are accepted for this option eg odd 1");
                            }else
                            {
                                square(number);
                            }
                        }catch (NumberFormatException ex)
                        {
                            System.out.println("Invalid value: only int accepted!");
                        }
                        break;
                    case "show":
                        if(length > 2)
                        {
                            System.out.println("Only Two Parameters are accepted for this option eg show \"Hello\"");
                        }else
                        {
                            show(firstArgument);
                        }

                        break;
                    case "concat":
                        if(length > 3)
                        {
                            System.out.println("Only Two Strings are accepted for this option eg concat \"Mlu\" \"Khumalo\"");
                        }else if(length < 2)
                        {
                            System.out.println("Only Two Strings are accepted for this option eg concat \"Mlu\" \"Khumalo\"");



                        }else
                        {
                           concat(firstArgument, secondArgument);
                        }

                        break;

                    case "range":
                        try
                        {
                            int number1 = Integer.parseInt(firstArgument);
                            int number2 = Integer.parseInt(secondArgument);

                            if(length > 3)
                            {
                                System.out.println("Only Two Parameters are accepted for this option eg odd 1");
                            }else
                            {
                                range(number1, number2);
                            }
                        }catch (NumberFormatException ex)
                        {
                            System.out.println("Invalid value: only int accepted!");
                        }
                        break;

                    case "quit":
                        quit();
                        break;



                }
            }

        }

    }

    public static void separateString(String input)
    {
       String[] splitArray = input.split(" ");
        length = splitArray.length;
       if(splitArray.length == 3)
       {
           option = splitArray[0];
           firstArgument = splitArray[1];
           secondArgument = splitArray[2];
       }else if(splitArray.length == 2)
       {
           option = splitArray[0];
           firstArgument = splitArray[1];
       }else if(splitArray.length == 1)
       {
           System.out.println("Invalid option!, two arguments required");
       }

    }

    public static void odd(int value)
    {

            if(value % 2 != 0)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }

    }

    public static void even(int value)
    {
            if(value % 2 == 0)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }


    }

    public static void square(int value)
    {

            if(value < 0)
            {
                System.out.println("Can't evaluate a square root of negetive");
            }else
            {
                System.out.println(Math.sqrt(value));
            }

    }

    public static void show(String string)
    {
        System.out.println(string);
    }

    public static void concat(String a, String b)
    {
        System.out.println(a +" " + b);
    }

    public static void range(int a, int b)
    {
        for(int i = a; i<= b; i++)
        {
            System.out.print(i+" ");
        }
    }

    public static void quit()
    {
        System.out.println("Program ended. Bye!");
       isQuit = true;

    }

}
