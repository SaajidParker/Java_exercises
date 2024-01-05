import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UsernameValidator {

    public void validate(int userNameNum, String username) {
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");

        for (int name = 0; name < userNameNum; name++) {
            int userNameNumber = userNameNum;
            String userName = username;
            Matcher matcher = pattern.matcher(userName);

            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
