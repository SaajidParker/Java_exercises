import java.text.NumberFormat;
import java.util.*;
public class CurrencyFormatter {


    public void Converter(double payment){

        String  us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en ", "IN")).format(payment).replace("INR ", "Rs.");
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String southAfrica = NumberFormat.getCurrencyInstance(new Locale("en","ZA")).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        System.out.println("South Africa: " + southAfrica);
    }
}
