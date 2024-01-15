import java.io.*;
import java.util.*;
public class InverseNumArrayExercise {
Scanner input = new Scanner(System.in);
    public void inverseArray() {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Please enter an integer number for the list to invert:");
            arr[i] = input.nextInt();

        }
        for(int j = 0; j < arr.length; j++){
            arr[j] *= -1;
        }
        System.out.println("The inverted list of numbers are:");
        System.out.println(Arrays.toString(arr));
    }
}
