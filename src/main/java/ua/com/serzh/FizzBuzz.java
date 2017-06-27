package ua.com.serzh;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * @author sergii.zagryvyi on 27.06.2017
 */
public class FizzBuzz {

    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";

    private String fizzBuzzFirst(int number) {
        String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? FIZZ : "") + (n % 5 == 0 ? BUZZ : ""))
                .orElse("What...");
        return result.isEmpty() ? Integer.toString(number) : result;
    }

    private String fizzBuzzSecond(int input) {
        return Optional.of(input).map(i -> {
            if (i % (3 * 5) == 0) {
                return FIZZ_BUZZ;
            } else if (i % 3 == 0) {
                return FIZZ;
            } else if (i % 5 == 0) {
                return BUZZ;
            } else {
                return Integer.toString(i);
            }
        }).orElse("What...");
    }


    private Predicate<Integer> divBy3() {
        return arg -> arg % 3 == 0;
    }

    private Predicate<Integer> divBy5() {
        return arg -> (arg % 5) == 0;
    }

    private String fizzBuzzPredicate(int num) {
        String fizz = divBy3().test(num) ? FIZZ : "";
        String buzz = divBy5().test(num) ? BUZZ : "";
        return fizz.isEmpty() && buzz.isEmpty() ? Integer.toString(num) : fizz.concat(buzz);
    }

    /*private String fizzBuzzPredicate(int num) {
        StringBuilder result = new StringBuilder();
        result.append(divBy3().test(num) ? FIZZ : "");
        result.append(divBy5().test(num) ? BUZZ : "");
        return result.length() == 0 ? Integer.toString(num) : result.toString();
    }*/

    public void print(int from, int to) {
        IntStream.range(from, to)
                .mapToObj(this::fizzBuzzPredicate)
                .forEach(System.out::println);
    }

    @Test
    public void printTest() {
        print(1, 100);
    }

    @Test
    public void testPredicates() {
        assertEquals(true, divBy3().test(3));
        assertEquals(true, divBy5().test(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals(FIZZ, fizzBuzzPredicate(9));
        assertEquals(BUZZ, fizzBuzzPredicate(10));
        assertEquals(FIZZ_BUZZ, fizzBuzzPredicate(30));
    }

    private Function<Integer, String> function1 = this::fizzBuzzFirst;
    private Function<Integer, String> function2 = this::fizzBuzzSecond;
    private Function<Integer, String> function3 = this::fizzBuzzPredicate;


    @Test
    public void fizzBuzzFirstTest() {
        run(function1);
    }

    @Test
    public void fizzBuzzSecondTest() {
        run(function2);
    }

    @Test
    public void fizzBuzzPredicateTest() {
        run(function3);
    }

    private void run(Function<Integer, String> function) {
        List<String> result = new ArrayList<>();

        IntStream.range(1, 100)
//                .mapToObj(this::fizzBuzz)
//                .mapToObj(t -> function.apply(t))
                .mapToObj(function::apply)
                .forEach(result::add);

        assertEquals("1", result.get(0));
        assertEquals(FIZZ, result.get(2));
        assertEquals("4", result.get(3));
        assertEquals(BUZZ, result.get(4));
        assertEquals("7", result.get(6));
        assertEquals("8", result.get(7));
        assertEquals(FIZZ_BUZZ, result.get(14));
    }

}
