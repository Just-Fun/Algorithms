package ua.com.serzh.matrixUtils;

/**
 * Created by serzh on 12/12/15.
 */
public class MatrixUtilsWithEx {
    public static void main(String[] args) {
        /*int[][] m1 = {{1, 2}, {7, 8}, {3, 4}};
        int[][] m2 = {{3, 4, 5, 6}, {9, 0, 1, 2}};*/

        int[][] m1 = {{10}};
        int[][] m2 = {{100}};
        int[][] out = mul(m1, m2);
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[0].length; j++) {
                System.out.print(out[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] mul(int[][] fst, int[][] snd) {
        int rowFst = fst.length;    // 3
        int colSnd = snd[0].length; // 4
        int colFstOrRowSnd = fst[0].length;
        int[][] ans = new int[rowFst][colSnd];

        try {
            for (int rowAns = 0; rowAns < rowFst; rowAns++) {
                for (int colAns = 0; colAns < colSnd; colAns++) {
                    int temp = 0;
                    for (int i = 0; i < colFstOrRowSnd; i++) {
                        temp += fst[rowAns][i] * snd[i][colAns];
                    }
                    ans[rowAns][colAns] = temp;
                }
            }
        } catch (Exception e) {
            System.out.println(new IllegalArgumentException().toString());
            throw new IllegalArgumentException();
        }
        return ans;
    }
}
