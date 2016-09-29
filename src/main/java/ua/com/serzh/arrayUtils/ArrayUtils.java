package ua.com.serzh.arrayUtils;

/**
 * Created by serzh on 12/12/15.
 */
public class ArrayUtils {

    public static void main(String[] args) {
//        int[][] example1 = {{1}, {3}};
        int[][] example2 = {{1, 2}, {3, 4}};
        int[][] example3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] out = rotateClockwise(example3);
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[0].length; j++) {
                System.out.print(out[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] rotateClockwise(int[][] arg) {
        int rowLength = arg[0].length;
        if (arg.length != rowLength) return null;
        int[][] ans = new int[arg.length][rowLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                ans[j][rowLength - 1 - i] = arg[i][j];
            }
        }
        return ans;
    }
}
