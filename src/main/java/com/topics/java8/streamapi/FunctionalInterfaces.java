package com.topics.java8.streamapi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x % 2 == 0;
        // Predicate<String> isNameStartsWithD = str -> str.startsWith("D");
        // Predicate<String> isNameEndsWithK = str -> str.endsWith("k");
        // Predicate<String> nameStartWithDEndsWithK =
        // isNameStartsWithD.and(isNameEndsWithK);
        // System.out.println(predicate.test(92));
        // System.out.println(isNameStartsWithD.test("Deep"));
        // System.out.println(nameStartWithDEndsWithK.test("epak"));

        // Function<Integer, Integer> by100 = arg0 -> arg0 * 100;
        // System.out.println(by100.apply(25));
        Function<Integer, Integer> doubleVal = x -> x * 2;
        // System.out.println(doubleVal.apply(25));
        // System.out.println(doubleVal.compose(by100).apply(41));

        Supplier<Integer> supplier = () -> 101;
        // System.out.println(supplier.get());

        Consumer<Integer> consumer = val -> System.out.println(val);
        // com.accept("Java developer");
        // com.accept("Deepak kumar");

        if (predicate.test(supplier.get())) {
            consumer.accept(doubleVal.apply(supplier.get()));
        }

    }
}
