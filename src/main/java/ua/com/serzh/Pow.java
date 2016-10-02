package ua.com.serzh;

/**
 * Created by Serzh on 10/2/16.
 */
public class Pow {

    public static int pow(int num, int degree) {
        int result = num;
        for (int i = 1; i < degree; i++) {
            result *= num;
        }
        return result;
    }

    public static int powRecurs(int num, int degree) {
        if ( degree == 0 ) {
            return 1;
        }
        return num * powRecurs(num, degree - 1);
    }
}
