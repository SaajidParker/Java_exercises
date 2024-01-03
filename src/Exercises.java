import java.util.Scanner;
public class Exercises {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        StringChallengeOne call = new StringChallengeOne();
        System.out.println(call.stringTimes("hello",4));
        DayCalendarFinder find = new DayCalendarFinder();
        System.out.println(find.findDay(8,13,1999));
        CurrencyFormatter formatting = new CurrencyFormatter();
        double payment = scanner.nextDouble();
        formatting.Converter(payment);
    }


}
