package ua.com.serzh.arrayUtils_2;

/**
 * Created by serzh on 12/12/15.
 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[][][] example1 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        int[][][] example2 = {{{10, 11, 12}, {20, 21, 22}, {30, 31, 32}}, {{40, 41, 42}, {50, 51, 52}, {60, 61, 62}},
                {{70, 71, 72}, {80, 81, 82}, {90, 91, 92}}};
        int[][][] exampleOne = {{{1}}};

        int[][][] ans = rotateClockwise(exampleOne);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                for (int k = 0; k < ans.length; k++) {
                    System.out.print(ans[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][][] rotateClockwise(int[][][] arg) {
        if (arg == null || arg.length < 1) {
            return null;
        }
        try {
            for (int i = 0; i < arg.length; i++) {
                if(arg.length != arg[i].length) {
                    return null;
                }
                if(arg[i].length != arg[i][i].length) {
                    return null;
                }
            }
        } catch (Exception e) {
            return null;
        }

        int i1 = 0;
        int j1 = 0;
        int k1 = 0;

        int rowLength = arg[0].length;
        int[][][] ans = new int[rowLength][rowLength][rowLength];
        try {
            for (int i = 0; i < rowLength; i++) {
                for (int j = 0; j < rowLength; j++) {
                    for (int k = 0; k < rowLength; k++) {
                        j1 = i;
                        k1 = j;
                        i1 = k;
                        ans[i][j][k] = arg[i1][j1][k1];
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
        return ans;
    }
}
