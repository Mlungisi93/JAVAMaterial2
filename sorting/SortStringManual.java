package sorting;
public class SortStringManual {

    public static void main(String[] args) {
        //System.out.println( "Heita Daar!" );

        int temp;

        int[] someNums = {8, 1, 9, 5, 4, 6, 2};
        for (int a = 0; a < (someNums.length - 1); a++) {
            for (int b = 0; b < (someNums.length - 1); b++) {
                if (someNums[b] > someNums[b + 1]) {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }
        }
        for (int i = 0; i < (someNums.length - 1); i++) {
            System.out.println(someNums[i]);
        }
    }
}
