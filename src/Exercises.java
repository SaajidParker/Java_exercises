import java.sql.SQLOutput;

public class Exercises {

    public static void main(String[] args){
        StringChallengeOne call = new StringChallengeOne();
        System.out.println(call.stringTimes("hello",4));
        DayCalendarFinder find = new DayCalendarFinder();
        System.out.println(find.findDay(8,13,1999));
    }


}
