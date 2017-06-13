package ua.com.serzh;

/**
 * Created by Sergey on 6/13/17.
 */
public class CountPages {

    public static void main(String[] args) {

        int result = countPages(2775);
        System.out.println(result);
    }

    private static int countPages(int digits) {
        int count = 0;
        for (int i = 1; ; i++) {
            int length = Integer.toString(i).length();
            count += length;
            if (count > digits) {
                return -1;
            }
            if (count == digits) {
                return i;
            }
        }
    }
}
