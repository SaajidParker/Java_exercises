public class OddOrEven {
    public String oddOrEven(double number){
        String message = "";
        if(number%2 == 0){
            message = "The number " + number + " is Even.";
        }else{
            message = "The number " + number + " is Odd.";
        }
        return message;
    }
}
