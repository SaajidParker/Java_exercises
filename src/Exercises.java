import java.util.Scanner;
import java.math.*;
public class Exercises {

    public static void main(String[] args){
        //Initializing scanner to be implemented in all the method classes
        Scanner scanner = new Scanner(System.in);

        // String Challenge
        StringChallengeOne call = new StringChallengeOne();
        String printing;
        int numToPrint;
        System.out.println("Please enter a string:");
        printing = scanner.next();
        System.out.println("Please enter the amount of times you want to print the string:");
        numToPrint = scanner.nextInt();
        System.out.println(call.stringTimes(printing,numToPrint));

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

        //Practicing String manipulation and functions
        StringChallengeTwo manipulate = new StringChallengeTwo();
        System.out.println("Let's input and manipulate two string values.");
        System.out.println("Please enter the first word:");
        String a = scanner.next().trim();
        System.out.println("Please enter the second word:");
        String b = scanner.next().trim();
        manipulate.manipulateString(a,b);

        //Palindrome checker
        PalindromeChecker palindromeCheck = new PalindromeChecker();
        System.out.println("Let's try out this palindrome checker.");
        System.out.println("Please enter a word to check if it's a palindrome:");
        String word = scanner.next();
        palindromeCheck.palindrome(word);

        //Prime Number Checker Using BigInteger methods
        PrimeNumberChecker prime = new PrimeNumberChecker();
        System.out.println("Let's try out this Prime number checker.");
        System.out.println("Please enter a number you want to check is prime or not:");
        String pnumber = scanner.next();
        prime.PrimeCheck(pnumber);

        //BigInteger Exercise
        BigIntegerExercise BigInt = new BigIntegerExercise();
        System.out.println("Let's work with Big Integers.");
        System.out.println("Please enter the first Big Integer:");
        BigInteger A = scanner.nextBigInteger();
        System.out.println("Please enter the second Big Integer:");
        BigInteger B = scanner.nextBigInteger();
        BigInt.BigMultiply(A,B);

        //Substring Exercise
        System.out.println("Let's try out cutting Strings into a substring.");
        System.out.println("Please enter the String you want to use:");
        String subStringWord = scanner.next();
        System.out.println("Please enter the starting index of the string you want to cut:");
        int startStringCut = scanner.nextInt();
        System.out.println("Please enter the ending index of the string you want to cut:");
        int endStringCut = scanner.nextInt();
        SubstringExercise substringex = new SubstringExercise();
        substringex.subStringCutter(subStringWord,startStringCut,endStringCut);

        //Inverting Integer numbers in an array
        InverseNumArrayExercise inverse = new InverseNumArrayExercise();
        System.out.println("Let's try out this inverting number program.");
        inverse.inverseArray();

        //Odd or Even Number Checker
        OddOrEven checkingEvenOdd = new OddOrEven();
        System.out.println("Please enter a number to check if it's Even or Odd:");
        double num = scanner.nextDouble();
        System.out.println(checkingEvenOdd.oddOrEven(num));


    }

}
