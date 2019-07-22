// This demo provides two alternative ways of doing the search

public class Search {

    public static void main(String[] args) {

        double[] prices = new double[10000];
        double value = 1.0;
        double searchValue = 9234.0;

        //initialize with a value between 1 and 10000
        for(int i=0; i < prices.length; i++){
            prices[i] = value;
            value += 1.0;
        }



        //search all prices in array
        // ***** This is the first alternative of doing the search
        for(int i=0; i < prices.length; i++){
            if(prices[i] == searchValue)
                System.out.println("Found the value of  "+searchValue+" at array position : "+i);
        }

        // ***** This is the first second of doing the search
        boolean matchNotFound = false;
        int count = 0;
        //search all prices in array
        do{
            matchNotFound = (prices[count] != searchValue);
            if(matchNotFound == false){
                System.out.println("Found the value of  "+searchValue+" at array position : "+count);
                break;
            }
            count++;
        }while(matchNotFound && count < prices.length);

    }
}
