public class StringChallengeTwo {
    public void manipulateString(String a, String b){

        //calculate sum of words
        int sumOfWords = a.length() +b.length();
        System.out.println(sumOfWords);

        // Compare lexicographical order
        String lexicographicalComparison = a.compareTo(b) > 0 ? "Yes" : "No";
        System.out.println(lexicographicalComparison);

        // Capitalize and print
        String capitalizedString1 = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capitalizedString2 = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(capitalizedString1 + " " + capitalizedString2);
    }
}
