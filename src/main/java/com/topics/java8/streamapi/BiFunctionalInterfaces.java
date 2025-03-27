package com.topics.java8.streamapi;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfaces {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x < y;
        System.out.println(biPredicate.test(20, 10));

        BiFunction<String, String, Integer> biFunction = (str1, str2) -> (str1 + str2).length();
        System.out.println(biFunction.apply("Deepak", "Ruhi"));

        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out
                .println("{\n\t'name' : '" + name + "',\n\t'age':'" + age + "'\n}");
        biConsumer.accept("Deepak", 21);
    }

}
