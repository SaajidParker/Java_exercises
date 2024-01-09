import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Exercises {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // String Challenge
        StringChallengeOne call = new StringChallengeOne();
        System.out.println(call.stringTimes("HelloHowAreYou?",3));
        // Day finder in calendar
        DayCalendarFinder find = new DayCalendarFinder();
        System.out.println("Let's find out the day of the week you were born:");
        System.out.println("Please enter the month you were born:");
        int month = scanner.nextInt();
        System.out.println("Please enter the day you were born:");
        int day = scanner.nextInt();
        System.out.println("Please enter the year you were born:");
        int year = scanner.nextInt();
        System.out.println("The day you were born on is a: " + find.findDay(month,day,year));
        //Currency Formatter
        CurrencyFormatter formatting = new CurrencyFormatter();
        System.out.println("Please enter an amount you want to format:");
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
        System.out.println("Enter the number of unique pairs to add to hashset:");
        int n = scanner.nextInt();
        pairsCounter.processPairs(n, scanner);
        //Try and catch practice for dividing by zero
        TryandCatchPractice trying = new TryandCatchPractice();
        trying.Trycatch(scanner);
        //Practicing converting a double value to whole and fractional parts
        System.out.println("Please enter a double value:");
        double value = scanner.nextDouble();
        MathProblems mathing = new MathProblems();
        mathing.fractionValue(value);
    }


}
