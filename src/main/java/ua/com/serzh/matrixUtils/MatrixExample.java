package ua.com.serzh.matrixUtils;

/**
 * Created by serzh on 12/12/15.
 */
public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("[" + row + "][" + col + "] ");
            }
            System.out.println();
        }
    }
}
