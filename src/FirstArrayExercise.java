import java.util.*;

public class FirstArrayExercise {

    public void arr() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array you want to create:");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i  = 0; i<a.length; i++){
            System.out.println("Please enter next value for array");
            a[i]= scan.nextInt();
        }


        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}