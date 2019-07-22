package JavaAssignments;

import java.util.Scanner;

public class JavaTestQuestion1 {
    static int input;
    public static void main(String[]args) {

        boolean isInt = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int input = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(input + " times " + i +" equals: " + (i * input));
        }

    }

}
