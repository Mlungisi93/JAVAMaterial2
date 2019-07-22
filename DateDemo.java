import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDemo {

    static final String CHRISTMAS_DAY = "2019-12-25";

    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();

        System.out.println("The year is "+ dateNow.getYear());
        dateNow.plusWeeks(2);
        System.out.println("The date today is "+ dateNow);
        System.out.println("The date  2 weeks from today is "+ dateNow.plusWeeks(2));

        LocalDate christmasDay = LocalDate.parse(CHRISTMAS_DAY);
        System.out.println("Christmas day date is "+ christmasDay);
        System.out.println("There are "+dateNow.until(christmasDay).getMonths()+" months and "+dateNow.until(christmasDay).getDays()+" days until Christmas");

        System.out.println("There are "+ ChronoUnit.DAYS.between(dateNow, christmasDay)+" days in total until Christmas");



    }

}