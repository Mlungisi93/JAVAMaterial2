public class ArrayInit {

    public static void main(String[] args) {

        int[] multiplesOfTen = {10, 20, 30, 40, 50, 60};
        int[] noInitialValues = new int[5];
        int secondNoInitialValues[] = new int[10];

        System.out.println("the fourth item in the multiplesOfTen array is  "+multiplesOfTen[3]);
        System.out.println("the fourth item in the noInitialValues array is  "+noInitialValues[3]);
        System.out.println("the length of the multiplesOfTen array is  "+multiplesOfTen.length);

        secondNoInitialValues[0] = 2;
        secondNoInitialValues[1] = 4;
        secondNoInitialValues[2] = 6;
        secondNoInitialValues[3] = 8;
        secondNoInitialValues[4] = 10;
        secondNoInitialValues[5] = 12;
        secondNoInitialValues[6] = 14;
        secondNoInitialValues[7] = 16;
        secondNoInitialValues[8] = 18;
        secondNoInitialValues[9] = 20;

        int oddNumbers[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    }
}
