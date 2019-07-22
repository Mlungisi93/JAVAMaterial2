import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Spring {
    static final String SPRING_DAY = "2019-09-01";

    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();

       // System.out.println("The year is "+ dateNow.getYear());
        //dateNow.plusWeeks(2);
        System.out.println("The date today is "+ dateNow);
        //System.out.println("The date  2 weeks from today is "+ dateNow.plusWeeks(2));

        LocalDate springDay = LocalDate.parse(SPRING_DAY);
        System.out.println("Spring day date is "+ springDay);
        System.out.println("There are "+dateNow.until(springDay).getMonths()+" months and "+dateNow.until(springDay).getDays()+" days until spring");

        System.out.println("There are "+ ChronoUnit.DAYS.between(dateNow, springDay)+" days in total until Spring");



    }
}
