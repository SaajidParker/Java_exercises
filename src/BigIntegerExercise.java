import java.math.BigInteger;

public class BigIntegerExercise {

    public void BigMultiply(BigInteger A, BigInteger B){
        BigInteger sum= A.add(B);
        BigInteger product = A.multiply(B);
        System.out.println("The sum of the two BigIntegers are: "+sum);
        System.out.println("The product of the two BigIntegers are: "+product);
    }
}
