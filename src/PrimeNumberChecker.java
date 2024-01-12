import java.math.BigInteger;

public class PrimeNumberChecker {
    public void PrimeCheck(String n){
        BigInteger new_n = new BigInteger(n);
        if(new_n.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
