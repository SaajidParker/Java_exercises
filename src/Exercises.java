import java.util.Scanner;
public class Exercises {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // String Challenge
        StringChallengeOne call = new StringChallengeOne();
        System.out.println(call.stringTimes("HelloHowAreYou?",3));
        // Day finder in calendar
        DayCalendarFinder find = new DayCalendarFinder();
        System.out.println(find.findDay(12,8,1999));
        //Currency Formatter
        CurrencyFormatter formatting = new CurrencyFormatter();
        double payment = scanner.nextDouble();
        formatting.Converter(payment);
        //Username Validator using REGEX
        UsernameValidator valid = new UsernameValidator();
        valid.validate(1,"SaajidParker");
        //Creating an array and calling the values added to it
        FirstArrayExercise firstarray = new FirstArrayExercise();
        firstarray.arr();
        //Practicing Hashsets
        HashsetPractice pairsCounter = new HashsetPractice();
        System.out.println("Enter the number of pairs:");
        int n = scanner.nextInt();
        pairsCounter.processPairs(n, scanner);
        //Try and catch practice for dividing by zero
        TryandCatchPractice trying = new TryandCatchPractice();
        trying.Trycatch(scanner);
    }


}
