package JavaLessons;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        //int[] number = {1,2,3};
       // System.out.println(number[1]);

        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        for(int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(matrix[2][1]);

    }
}