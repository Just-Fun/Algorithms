package ua.com.serzh.practice;

/**
 * Created by serzh on 12/3/15.
 */
public class Main {
    public static void main(String[] args) {
        assertMethod("codex", "codey");
        assertMethod("x", "y");
        assertMethod("axa", "aya");
        assertMethod("xa", "ya");
        assertMethod("xa", "ya");
        assertMethod("", "");
        assertMethod("h", "h");
        assertMethod("xxx", "yyy");
        assertMethod(" ", " ");
    }

    private static void assertMethod(String input, String expected) {
        String actual = chageXY(input);
        String status = actual.equals(expected) ? "OK" :
                "FAIE " + "expected: '" + expected + "' but was: '" + actual + "'";
        System.out.println(status);
    }

    public static String chageXY(String input) {
        char[] chars = input.toCharArray();
        char[] result = new char[input.length()];
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == 'x') {
                result[index] = 'y';
            } else {
                result[index] = chars[index];
            }
        }
        return String.valueOf(result);
    }
    // make it work -> make it better -> make it fast
}
