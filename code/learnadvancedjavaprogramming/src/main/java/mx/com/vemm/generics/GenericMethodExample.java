package mx.com.vemm.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {

    private static final Character[] CHARACTERS = {'h', 'e', 'l', 'l', 'o'};
    private static final Integer[] INTEGERS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final Boolean[] BOOLEANS = {true, false, true, true, false};

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T o : array) {
            list.add(o);
        }
        return list;
    }

    public static void display() {
        List<Character> characters = GenericMethodExample.arrayToList(CHARACTERS, new ArrayList<>());
        List<Integer> integers = GenericMethodExample.arrayToList(INTEGERS, new ArrayList<>());
        List<Boolean> booleans = GenericMethodExample.arrayToList(BOOLEANS, new ArrayList<>());
        System.out.println(characters);
        System.out.println(integers);
        System.out.println(booleans);
    }
}
