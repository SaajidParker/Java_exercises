public class LoopingArrays {

    public void arraylooping(int[] ages){
        //using a for loop to loop through the arrays using the length function.
        int sum = 0;
        for(int x = 0; x<ages.length;x++){
            sum += ages[x];
        }
        System.out.println(sum);
    }
}
