public class Multidimensional_Array {
    public void superiorArray(){
        //This is a multidimensional array
        int[][] sample = {{1,2,3},{4,5,6}};
        // To access an element inside a multidimensional array we can use this
        int x = sample[1][0];
        System.out.println(x);

        // We can visualize the rows and columns like this where the first value is the row and second value is the column
        sample = new int[][]{
                {1, 2, 3},
                {4, 5, 6}};
    }
}
