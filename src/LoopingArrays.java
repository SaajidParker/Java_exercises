public class LoopingArrays {

    public void arraylooping(int[] ages){
        //using a for loop to loop through the arrays using the length function.
        int sum = 0;
        for(int x = 0; x<ages.length;x++){
            sum += ages[x];
        }
        System.out.println("The sum of the array using a for loop with array length is: "+sum);
        sum = 0;
        //Or you can make it a shortcode using for each
        for(int x:ages){
            sum+=x;
        }
        System.out.println("The sum of the array using a for each loop is: "+sum);
    }
}
