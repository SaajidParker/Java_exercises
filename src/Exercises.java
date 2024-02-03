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

        //Luck tester with switch case statements
        SwitchStatementsExercise switching = new SwitchStatementsExercise();
        System.out.println("Please choose a number 1 or 2:");
        int x = scanner.nextInt();
        switching.messages(x);

        //Count Down using while loop
        WhileLoopPractice looping = new WhileLoopPractice();
        System.out.println("Please enter a number to countdown from");
        x = scanner.nextInt();
        looping.looping(x);

        //Factorial sum calculator with a for loop
        ForLooping forlooper = new ForLooping();
        System.out.println("Let's try out the factorial calculator.");
        System.out.println("Please enter a number:");
        int N = scanner.nextInt();
        forlooper.ForLooper(N);

        //Practicing looping values in an array
        LoopingArrays looper = new LoopingArrays();
        int [] count = {1,2,3,4,5,6,7,8,9,10};
        looper.arraylooping(count);

        //Multidimensional arrays
        Multidimensional_Array multi = new Multidimensional_Array();
        int [][] multiArray = new int[2][3];
        //Looping for user input
        for(x = 0; x < multiArray.length;x++){
            for (int y = 0; y < multiArray[x].length;y++){
                System.out.println("Please enter an integer value for the array:");
                multiArray[x][y] = scanner.nextInt();
            }
        }
        multi.superiorArray(multiArray);

        //Area calculator
        AreaCalculator areaCalc = new AreaCalculator();
        double length;
        double width;
        double base;
        double height;
        double radius;
        String shapeAreaChoice;

        System.out.println("Let's calculate area of a shape.");
        System.out.println("Please select a shape: rectangle, circle, triangle:");

        while(true) {
             shapeAreaChoice = scanner.next();
            if(!shapeAreaChoice.equals("triangle") && !shapeAreaChoice.equals("rectangle") && !shapeAreaChoice.equals("circle")){
                System.out.println("Please choose either rectangle, circle, or triangle:");

            }   else if(shapeAreaChoice.equals("rectangle")){
                System.out.println("Please enter the length of the rectangle: ");
                length = scanner.nextDouble();
                System.out.println("Please enter the height of the rectangle: ");
                height = scanner.nextDouble();
                areaCalc.RectangleArea(length,height);
                break;

            } else if (shapeAreaChoice.equals("circle")) {
                System.out.println("Please enter the radius of the circle:");
                radius = scanner.nextDouble();
                areaCalc.CircleArea(radius);
                break;

            } else if (shapeAreaChoice.equals("triangle")) {
                System.out.println("Please enter the base of the triangle:");
                base = scanner.nextDouble();
                System.out.println("Please enter the width of the triangle:");
                width = scanner.nextDouble();
                areaCalc.TriangleArea(width,base);
                break;
            }
        }
        //Using the math class functions
        MathClasses mathingClasses = new MathClasses();
        System.out.println("Please enter an integer value: ");
        x = scanner.nextInt();
        mathingClasses.absoluteValue(x);
        System.out.println("Please enter a double value: ");
        double y =scanner.nextDouble();
        mathingClasses.ceilingValue(y);
        mathingClasses.floorValue(y);
        System.out.println("Please enter two integer numbers:");
        System.out.println("Integer number 1: ");
        x = scanner.nextInt();
        System.out.println("Integer number 2: ");
        int ye = scanner.nextInt();
        mathingClasses.maxValue(x,ye);
        mathingClasses.minValue(x,ye);
        System.out.println("Let's use the power class in the Math package:");
        System.out.println("Please enter a number:");
        x = scanner.nextInt();
        System.out.println("Please enter the power number:");
        int power = scanner.nextInt();
        mathingClasses.powerOfValue(x,power);

        //Using getters and setters
        System.out.println("Please enter persons' name:");
        String name = scanner.next();
        System.out.println("Please enter an age to see if it meets requirements:");
        int age = scanner.nextInt();
        GettersAndSetters gettersAndSetters = new GettersAndSetters();

        //Setting the age via a Setter method we made
        if(age<0){
            System.out.println("Invalid age");
            gettersAndSetters.setAge(0);
        }else{
            gettersAndSetters.setAge(age);
        }
        System.out.println("Name of person is: "+name);
        System.out.println("Age of person is: "+gettersAndSetters.getAge());

}
}
