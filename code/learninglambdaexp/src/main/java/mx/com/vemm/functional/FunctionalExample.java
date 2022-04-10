package mx.com.vemm.functional;

import java.math.BigInteger;
import java.util.function.*;

public class FunctionalExample {

    public static final Predicate<String> STRING_PREDICATE = (s) -> s.length() < 10;
    public static final Consumer<String> STRING_CONSUMER = (s) -> System.out.println(s.toLowerCase());
    public static final Function<Integer, String> INTEGER_STRING_FUNCTION = (x) -> x.toString();
    public static final Supplier<String> STRING_SUPPLIER = () -> "Hello World!";
    public static final BinaryOperator<Integer> INTEGER_BINARY_OPERATOR = (x, y) -> x + y;
    public static final UnaryOperator<String> STRING_UNARY_OPERATOR = (s) -> s.toUpperCase();
    /* methods as lambdas */
    public static final IntFunction<String> STRING_INT_FUNCTION = Integer::toString;
    public static final Function<String, BigInteger> STRING_BIG_INTEGER_FUNCTION = BigInteger::new;
    public static final Consumer<String> STRING_CONSUMER_1 = System.out::println;
    public static final UnaryOperator<String> STRING_UNARY_OPERATOR_1 = "Hello "::concat;
    /* Create a functional interfaces */
    public static final Calculate ADD = (x, y) -> x + y;
    public static final Calculate DIFF = (x, y) -> x - y;
    public static final Calculate DIVIDE = (x, y) -> y != 0 ? x / y : 0;
    public static final Calculate MULTIPLY = (x, y) -> x * y;
    
}
