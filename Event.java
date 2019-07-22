public class Event {
    private double usageFee;
    private String name;
    public static void main(String[] args)
    {
        Event event1 = new Event();
        event1.setName("Mlungisi");
        event1.setUsageFee(500.00*2);
        System.out.println("Vanue Name: "+event1.getName()+ " Vanue Fee R"+event1.getUsageFee());

    }

    public double getUsageFee() {
        return usageFee;
    }

    public void setUsageFee(double usageFee) {
        this.usageFee = usageFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
