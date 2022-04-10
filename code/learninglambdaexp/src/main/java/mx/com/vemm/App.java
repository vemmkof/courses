package mx.com.vemm;

import mx.com.vemm.functional.FunctionalExample;
import mx.com.vemm.lambda.GreetingFunction;
import mx.com.vemm.lambda.RunnableLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    private static final String STRING = "hElLO";
    private static final Integer NUMBER = 1_000;

    public static void main(String[] args) {

        /* call and negate a predicate */
        System.out.println(FunctionalExample.STRING_PREDICATE.test(STRING));
        System.out.println(FunctionalExample.STRING_PREDICATE.negate().test(STRING));
        /* call a consumer */
        FunctionalExample.STRING_CONSUMER.accept(STRING);
        /* call a function */
        System.out.println(FunctionalExample.INTEGER_STRING_FUNCTION.apply(NUMBER));
        /* call a supplier */
        System.out.println(FunctionalExample.STRING_SUPPLIER.get());
        /* call a binaryOp */
        System.out.println(FunctionalExample.INTEGER_BINARY_OPERATOR.apply(NUMBER, NUMBER));
        /* call a unaryOp */
        System.out.println(FunctionalExample.STRING_UNARY_OPERATOR.apply(STRING));
        /* Runnable with lambdas */
        RunnableLambda runnableLambda = new RunnableLambda();
        runnableLambda.getRunnable1().run();
        runnableLambda.getRunnable2().run();
        /* functional interface */
        GreetingFunction greetingFunction = message -> System.out.println("Hi " + message);
        greetingFunction.sayMessage("VEMM");
        /* methods as lambdas */
        System.out.println(FunctionalExample.STRING_INT_FUNCTION.apply(5));
        System.out.println(FunctionalExample.STRING_BIG_INTEGER_FUNCTION.apply("1000000"));
        FunctionalExample.STRING_CONSUMER_1.accept("Hi");
        System.out.println(FunctionalExample.STRING_UNARY_OPERATOR_1.apply("VEMM"));
        /* created functional interfacxs*/
        System.out.println(FunctionalExample.ADD.calculate(5, 2));
        System.out.println(FunctionalExample.DIFF.calculate(5, 2));
        System.out.println(FunctionalExample.DIVIDE.calculate(5, 2));
        System.out.println(FunctionalExample.MULTIPLY.calculate(5, 2));
        /* Collections */
        List<String> names = Arrays.asList("Victor", "Edgar", "Mujica", "Marquez");
        Collections.sort(names, String::compareTo);
        System.out.println(names);
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);
        Collections.sort(names, Comparator.naturalOrder());
        System.out.println(names);
        /* Streams */
        names.stream().filter(name -> name.startsWith("M")).forEach(System.out::println);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
