package com.topics.java8.streamapi;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryFunctionalInterfaces {
    public static void main(String[] args) {
        UnaryOperator<Integer> fun = x -> x + 100;
        System.out.println(fun.apply(22));

        BinaryOperator<Integer> biFun = (x, y) -> x * y;
        System.err.println(biFun.apply(10, 20));
    }
}
