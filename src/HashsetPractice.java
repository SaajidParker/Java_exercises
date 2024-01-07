import java.util.*;
public class HashsetPractice {
    private Set<String> uniquePairs;

    public HashsetPractice() {
        this.uniquePairs = new HashSet<>();
    }

    public void processPairs(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            String first = sc.next();
            String second = sc.next();

            // Concatenate the pair and add to the set
            String pair = first + " " + second;
            uniquePairs.add(pair);

            // Print the number of unique pairs after each input
            System.out.println(uniquePairs.size());
        }
    }
}
