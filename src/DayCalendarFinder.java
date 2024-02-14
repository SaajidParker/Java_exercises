import java.time.DayOfWeek;
import java.time.LocalDate;
public class DayCalendarFinder {
    public  String findDay(int month, int day, int year) {
        //this is a calendar finder 
        LocalDate date = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.toString();
    }
}
