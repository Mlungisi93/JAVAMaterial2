public class RaiseOneArgument {
    private final double STANDARD_RAISE = 20.00;

    public static void main(String[] args) {
        RaiseOneArgument raise = new RaiseOneArgument(); // instance of raise one argument
        raise.predictRaise(492.55);
        // raise.predictRaise(raise.STANDARD_RAISE);
    }

    public void predictRaise(double amount){
        System.out.println("I think I will get a salary of : ZAR "+ (amount + STANDARD_RAISE));
    }

}
