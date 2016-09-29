package ua.com.serzh.parser;

/**
 * Created by serzh on 11/27/15.
 */
public class ParserTest1 {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + Parser1.eval("123"));
        System.out.println(">> 2*3 = " + Parser1.eval("2*3"));
        System.out.println(">> (1+3)*2 = " + Parser1.eval("(1+3)*2"));
        System.out.println(">> ((13/6)*2-5)+1 = " + Parser1.eval("((13/6)*2-5)+1"));
    }
}
