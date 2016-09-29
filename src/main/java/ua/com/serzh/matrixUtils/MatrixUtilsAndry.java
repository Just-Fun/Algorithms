package ua.com.serzh.matrixUtils;

/**
 * Created by serzh on 07.02.16.
 */
public class MatrixUtilsAndry {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2}, {7, 8}, {3, 4}};
        int[][] m2 = {{3, 4, 5, 6}, {9, 0, 1, 2}};

        /*int[][] m1 = {{10}};
        int[][] m2 = {{100}};*/
        int[][] out = mul(m1, m2);
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[0].length; j++) {
                System.out.print(out[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] mul(int[][] fst, int[][] snd) {

        int[][] resultArr = new int[fst[0].length][snd[1].length];

        for (int t = 0; t < snd[1].length; t++) {
            for (int i = 0; i < fst[0].length; i++) {
                int sum = 0;
                for (int j = 0; j < snd[1].length; j++) {
                    sum += fst[t][j] * snd[j][i];
                }
                resultArr[t][i] = sum;
            }
        }
        return resultArr;
    }
}

