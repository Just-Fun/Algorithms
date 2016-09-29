package ua.com.serzh.matrixUtils;

/**
 * Created by serzh on 12/12/15.
 */
public class MatrixUtils1 {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2}};
        int[][] m2 = {{3}, {9}};
        int[][] out = mul(m1, m2);

        System.out.println(out);
    }

    public static int[][] mul(int[][] fst, int[][] snd) {
        int row = fst.length;    // 1
        int col = snd[0].length; // 1
        int[][] ans = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
//                ans[i][j] = snd[i][j] * fst[]
            }


        }

        return ans;
    }
}
