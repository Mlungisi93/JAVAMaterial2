public class Eggs {
    public static void main(String[] args)
    {
    calcDozens(100);
    calcDozens(13);
    calcDozens(12);
    }

    public static void calcDozens(int noOfEggs)
    {
        int dozen = noOfEggs/12;
        int remainder = noOfEggs % 12;
        System.out.printf(dozen+ " Dozen%s" + " and "+ remainder+ " Egg%s" + "\n", dozen !=1 ? "s" : "", remainder != 1 ? "s": "");
    }
}
