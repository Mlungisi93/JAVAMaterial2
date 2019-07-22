public class Events {

    public static void main(String[] args) {

        EventVenue[] events = new EventVenue[3];

        EventVenue evOne = new EventVenue();
        evOne.setManagerName("Bob Jones");
        evOne.setUsageFee(600.00);

        EventVenue evTwo = new EventVenue();
        evTwo.setManagerName("Dave Clarke");
        evTwo.setUsageFee(300.00);

        EventVenue evThree = new EventVenue();
        evThree.setManagerName("Jennifer Black");
        evThree.setUsageFee(1000.00);

        events[0] = evOne;
        events[1] = evTwo;
        events[2] = evThree;

        for(int i=1; i<=events.length; i++){
            System.out.println("Event "+i+" manager's name is "+events[i-1].getManagerName());
            System.out.println("The price per day for event "+i+" EUR"+events[i-1].getUsageFee()+"\n");
        }
    }
}
