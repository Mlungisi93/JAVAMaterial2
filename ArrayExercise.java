public class ArrayExercise {
    public static void main(String[] args)
    {
        /*
        int[]evenNumbers = new int[10];
        evenNumbers[0] = 2;
        evenNumbers[1] = 4;
        evenNumbers[2] = 6;
        evenNumbers[3] = 8;
        evenNumbers[4] = 10;
        evenNumbers[5] = 12;
        evenNumbers[6] = 14;
        evenNumbers[7] = 16;
        evenNumbers[8] = 18;
        evenNumbers[9] = 20;

        for (int i = 0; i < evenNumbers.length ; i++) {
            System.out.println("Even number at position "+i+" is "+evenNumbers[i]);

        }

        //array of odd numbers
        int[]oddNumbers = {1,3,5,7,9,11,13,15,17,19};
        for (int i = 0; i < oddNumbers.length ; i++) {
            System.out.println("Odd number at position "+i+" is "+oddNumbers[i]);

        }
        */
        double[] prices  = {10.23, 33.31, 61.12, 99.98, 44.45, 1.58, 88.67, 73.90, 50.00,29.99};

        for (int i = 0; i < prices.length ; i++)
        {
            double increaseAmount = prices[i] *0.10;
            System.out.println(String.format("Prevous price R%.2f, New Price R%.2f", prices[i], (prices[i]+increaseAmount)));
        }
    }
}
