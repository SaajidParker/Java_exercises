public class ForLooping {
    public void ForLooper(int N){
        int sum = 1;
        for(int i = 1; i <= N ; i++){
            sum *= i;
        }
        System.out.println("The factorial sum of the number entered is: "+sum);
    }

}
