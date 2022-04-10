package mx.com.vemm.generics;

import java.util.ArrayList;
import java.util.List;

public class VarargsExample {

    public static void printShoppingList(String... items) {
        List<String> strings = GenericMethodExample.arrayToList(items, new ArrayList<>());
        System.out.println("Array: " + items);
        System.out.println("List: " + strings);
    }

    public static void display() {
        VarargsExample.printShoppingList("item1", "item2", "item3", "item4");
    }
}

