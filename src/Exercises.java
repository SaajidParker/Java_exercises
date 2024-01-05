import java.util.Scanner;
public class Exercises {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // String Challenge
        StringChallengeOne call = new StringChallengeOne();
        //System.out.println(call.stringTimes("HelloHowAreYou?",3));
        // Day finder in calendar
        DayCalendarFinder find = new DayCalendarFinder();
        //System.out.println(find.findDay(12,8,1999));
        //Currency Formatter
        CurrencyFormatter formatting = new CurrencyFormatter();
        //double payment = scanner.nextDouble();
        //formatting.Converter(payment);
        //Username Validator using REGEX
        UsernameValidator valid = new UsernameValidator();
        valid.validate(1,"1SaajidParker123");
    }


}
