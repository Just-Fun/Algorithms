package ua.com.serzh.arrayUtils;

/**
 * Created by serzh on 12/12/15.
 */
public class ArrayUtilsWithEx {

    public static void main(String[] args) {
        int[][] exampleNull = null;
        int[][] exampleHalfNull = new  int[0][];
        int[][] example1 = {{1}, {}};
        int[][] example2 = {{1, 2}, {3, 4}};
        int[][] example3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] out = rotateClockwise(exampleHalfNull);
        int[][] example4 = rotateClockwise(new int[][] {{0, 0}, null});
//        Object res1 = rotateClockwise(new int[][] {null});
//        System.out.println(arrays.toString(exampleHalfNull));

//        System.out.println(res1);
        /*for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[0].length; j++) {
                System.out.print(out[i][j]);
            }
            System.out.println();
        }*/

    }

    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null || arg.length < 1) {
            return null;
        }
        try {
            for (int i = 0; i < arg.length; i++) {
                if(arg.length != arg[i].length) {
                    return null;
                }
            }
        } catch (Exception e) {
            return null;
        }

        int rowLength = arg[0].length; // длина массива

        int[][] ans = new int[arg.length][rowLength];
        try {
            for (int i = 0; i < rowLength; i++) {
                for (int j = 0; j < rowLength; j++) {
                    ans[j][rowLength - 1 - i] = arg[i][j];
                }
            }
        } catch (Exception e) {
            return null;
        }
        return ans;
    }
}
