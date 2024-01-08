import java.io.*;
import java.util.*;
public class TryandCatchPractice {
        public  void Trycatch() {

            Scanner sc = new Scanner(System.in);

            try {

                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println(x/y);

            }

            catch (ArithmeticException e ) {

                System.out.println("java.lang.ArithmeticException: / by zero");

            }

            catch (InputMismatchException e) {

                System.out.println("java.util.InputMismatchException");

            }

        }
    }

