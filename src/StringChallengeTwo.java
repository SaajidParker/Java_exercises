public class StringChallengeTwo {
    public void manipulateString(String a, String b){

        //calculate sum of words
        int sumOfWords = a.length() +b.length();
        System.out.println("The sum of the length of characters of both words combined are:");
        System.out.println(sumOfWords);

        // Compare lexicographical order
        System.out.println("Comparing the two strings to see if the first string is lexicographically greater than the other:");
        String lexicographicalComparison = a.compareTo(b) > 0 ? "Yes" : "No";
        System.out.println(lexicographicalComparison);

        // Capitalize and print
        String capitalizedString1 = a.isEmpty() ? "" : a.substring(0, 1).toUpperCase() + a.substring(1);
        String capitalizedString2 = b.isEmpty() ? "" : b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println("Capitalizing the first letter of the two strings then adding them together in one sentence:");
        System.out.println(capitalizedString1 + " " + capitalizedString2);
    }
}
