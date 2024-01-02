public class Exercises {

    public static void main(String[] args){
        Exercises ex = new Exercises();
        System.out.println(ex.stringTimes("Hello",5));
    }
    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

}
