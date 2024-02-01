import java.math.*;
public class MathClasses {
    public void absoluteValue(int value){
        value = Math.abs(value);
        System.out.println("The absolute value of the integer is: "+value);
    }

    public void ceilingValue(double v){
        v = Math.ceil(v);
        System.out.println("The rounded up value is: "+ v);
    }

    public void floorValue(double a){
        a = Math.floor(a);
        System.out.println("The rounded down value is: "+ a);
    }

    public void maxValue(int x, int y){
       int max = Math.max(x,y);
        System.out.println("The maximum value of the two integers is: "+max);
    }

    public void minValue(int x, int y){
        int min = Math.min(x,y);
        System.out.println("The minimum value of the two integers is: "+min);
    }

    public void powerOfValue(int num, int power){
        double powerPlus =  Math.pow(num,power);
        System.out.println(num  +" to the power of "+power+" is equal to: "+powerPlus);
    }

}
