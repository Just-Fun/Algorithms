package ua.com.serzh.matrixExample;

/**
 * Created by Oleg on 11/28/2015.
 */
public class MatrixExsample {
    public static void main(String[] args) {
        int[][] array = {{3,5,4}, {1,9,7}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
