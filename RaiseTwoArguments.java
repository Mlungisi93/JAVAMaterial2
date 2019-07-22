
public class RaiseTwoArguments {
    private final double STANDARD_RAISE = 10.00;

    public static void main(String[] args) {
        RaiseTwoArguments raise = new RaiseTwoArguments();
        raise.predictRaise(472.55, "good performance");
        raise.predictRaise(raise.STANDARD_RAISE, "standard");
    }

    public void predictRaise(double amount, String raiseType){
        System.out.println("I think I will get a "+raiseType+" raise of : ZAR "+amount);
    }


}
