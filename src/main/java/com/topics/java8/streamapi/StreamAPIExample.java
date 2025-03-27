package com.topics.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 34, 56, 43, 21, 45, 77);
        Stream<Integer> stream = list.stream();
        // System.err.println(stream);
        // String[] arr = { "A", "B", "C", "D" };
        // List<String> collect = Arrays.stream(arr).collect(Collectors.toList());
        // System.err.println(collect);

        // Stream<String> stream2 = Stream.of("Deepu", "rahul", "Manish", "Manoj");
        // List<String> collect2 = stream2.filter(name ->
        // name.startsWith("M")).collect(Collectors.toList());
        // System.out.println(collect2);

        // Stream<Integer> stream3 = Stream.generate(() -> 1).limit(10);
        // System.out.println(stream3.collect(Collectors.toList()));

        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(10).collect(Collectors.toList());
        System.err.println(collect);

    }
}
