import java.io.*;
import java.util.*;
public class TryandCatchPractice {
        public  void Trycatch(Scanner sc) {



            try {
                System.out.println("Please enter 1st division value:");
                int x = sc.nextInt();
                System.out.println("Please enter 2nd division value:");
                int y = sc.nextInt();

                System.out.println(x + " / " + y + " = "+ x/y);


            }

            catch (ArithmeticException e ) {

                System.out.println("java.lang.ArithmeticException: cannot divide by zero");

            }

            catch (InputMismatchException e) {

                System.out.println("Entered an incorrect value type");

            }

        }
    }

