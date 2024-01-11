import java.lang.*;

public class PalindromeChecker {
    public void palindrome(String word){
        StringBuilder building = new StringBuilder();
        building.append(word);
        building.reverse();
        String reversed = String.valueOf(building);
        if(reversed.equals(word)){
            System.out.println("Yes, the word: "+word+" is a palindrome");
        }else{
            System.out.println("No, the word: "+word+" is not a palindrome");
        }
    }
}
