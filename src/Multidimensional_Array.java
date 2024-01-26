public class Multidimensional_Array {
    public void superiorArray(){
        int sum = 0;
        //This is a multidimensional array
        int[][] sample = {{1,2,3},{4,5,6}};
        // To access an element inside a multidimensional array we can use this
        int p = sample[1][0];
        System.out.println(p);

        // We can visualize the rows and columns like this where the first value is the row and second value is the column
        sample = new int[][]{
                {1, 2, 3},
                {4, 5, 6}};

        // In order to loop over a multidimensional array we need nested for loops
        for(int x = 0; x<sample.length;x++){
            for(int y = 0; y<sample[x].length;y++){
                sum += sample[x][y];
            }
        }
        System.out.println(sum);
    }
}
