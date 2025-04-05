package com.topics.java8.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {

        // List<String> sentences = List.of(
        // "My Name is Deepak", "I am a Java Developer",
        // "I code in Java and Spring Boot");

        // System.out.println(
        // sentences.stream().flatMap(sentence -> {
        // String[] wordArray = sentence.split(" ");
        // Stream<String> wordStream = Arrays.stream(wordArray);
        // return wordStream;
        // }).collect(Collectors.joining(" ")));

        // List<List<String>> groceries = List.of(
        // List.of("Apple", "Banana", "Kiwi"),
        // List.of("Tomato", "Potato", "Onion"),
        // List.of("Milk", "Cheese", "Curd"));
        // // Now convert these groceies different lists to a single list.
        // System.out.println(
        // groceries.stream()
        // .flatMap(groceryList -> groceryList.stream())
        // // You can also perform operations on streams
        // .filter(groceryStream -> groceryStream.length() > 5)
        // .map(groceryStream -> groceryStream.toUpperCase())
        // .collect(Collectors.toList()));
        // Stream.iterate(1, x->x+1).limit(20);
        // List<Integer> list = List.of(1, 2, 3, 4, 5);
        // // int sum = 0;
        // AtomicInteger sum = new AtomicInteger(0);

        // Stream<Integer> parallelStream = list.parallelStream();
        // Stream<Integer> sequential = parallelStream.sequential();
        // List<Integer> cumlativeSum = list.stream().map(num ->
        // sum.addAndGet(num)).collect(Collectors.toList());
        // System.out.println(cumlativeSum);

        // long startTime = System.currentTimeMillis();
        // List<Integer> nums = Stream.iterate(1, x -> x +
        // 1).limit(10000).collect(Collectors.toList());
        // List<Integer> factorials = nums.parallelStream().map(x ->
        // factorial(x)).collect(Collectors.toList());
        // long endTime = System.currentTimeMillis();
        // System.out.println("Total time in sequential processing of 2000 numbers " +
        // (endTime - startTime) + " ms.");

        // lon

        // Collection of elements as list
        // String str = "Count the number of occurence character 'a'";
        // System.err.println(str + " have " + str.chars().filter(x -> x ==
        // 'a').count());

        // List<Integer> list = List.of(12, 34, 56, 43, 21, 45, 77);
        // Double avg = list.stream().collect(Collectors.averagingInt(val -> val));
        // Long count = list.stream().collect(Collectors.counting());
        // Integer sum = list.stream().collect(Collectors.summingInt(val -> val));
        // System.out.println("Sum of " + list + " = " + collect);
        // System.out.println("Avg of " + list + " = " + stats.getAverage());
        // System.out.println("Count of " + list + " = " + stats.getCount());
        // System.out.println("Min of " + list + " = " + stats.getMin());
        // System.out.println("Max of " + list + " = " + stats.getMax());

        // System.out.println(collectedSet);

        // Map<String, Integer> fruitsWithPrice = Map.of(
        // "Apple", 100, "Orange", 90, "kiwi", 39);
        // long sum =
        // fruitsWithPrice.values().stream().collect(Collectors.summingInt(val -> val));
        // System.out.println(sum);
        // Stream<Integer> mappedStream = list.stream().map(num -> {
        // System.out.println("Adding 100 in " + num);
        // return num + 100;
        // });
        // System.err.println("Before terminal operation");
        // List<Integer> collect = mappedStream.collect(Collectors.toList());
        // System.err.println("After terminal operation");
        // System.err.println(collect);

        // System.out.println(list.stream().reduce((x, y) -> x + y).get());
        // System.out.println(list.stream().map(x -> x *
        // x).sorted().collect(Collectors.toList()));
        // boolean anyMatch = list.stream().anyMatch(x -> x % 5 == 0);
        // System.out.println(anyMatch);

        // boolean allMatch = list.stream().allMatch(x -> x > 10);
        // System.out.println(allMatch);

        // boolean noneMatch = list.stream().noneMatch(x -> x < 10);
        // System.out.println(noneMatch);
        // Optional<Integer> sumValue = list.stream().reduce((x, y) -> x + y);
        // System.out.println(sumValue.get());

        // Stream<Integer> count = Stream.iterate(1, x -> x + 1).limit(50);
        // System.err.println(count.collect(Collectors.toList()));

        // Stream<Integer> skip = Stream.iterate(1, x -> x + 1).skip(10).limit(50);
        // System.err.println(skip.collect(Collectors.toList()));
        // // Converting list to stream
        // Stream<Integer> stream = list.stream();
        // // Performing intermediate operation
        // Stream<Integer> filteredStream = stream.filter(val -> val < 50);
        // // Operation is not done as intermediate operation are lazy
        // List<Integer> filteredList = filteredStream.collect(Collectors.toList());
        // // Operation is done as terminal operation is done.
        // System.out.println(filteredList);

        // List<Integer> list2 = List.of(12, 34, 56, 43, 21, 45, 77);

        // Map<Boolean, List<Integer>> collect =
        // list2.stream().collect(Collectors.partitioningBy(val -> val % 2 == 0));
        // System.out.println(collect);
        // Stream<Integer> mappedStream = list.stream().map(val -> val + 100);
        // List<Integer> plusValues = mappedStream.collect(Collectors.toList());
        // System.out.println(plusValues);

        List<String> names = List.of("Deepu", "Rahul", "Manish", "Manoj");
        Map<String, Integer> collect = names.stream()
                .collect(Collectors.toMap(val -> val.toUpperCase(), name -> name.length()));
        System.out.println(collect);
        // Map<Integer, List<String>> collect =
        // names.stream().collect(Collectors.groupingBy(name -> name.length()));
        // System.out.println(collect);

        // String sentence = "This is my book. This book is very good";
        // Map<String, Long> collect = Arrays.stream(sentence.split(" "))
        // .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        // System.out.println(collect);
        // sentence.split(" ")
        // Stream<String> collect = names.stream();
        // Set<String> collect = names.stream()
        // .collect(Collectors.mapping(name -> name.toUpperCase(),
        // Collectors.filtering(name -> name.startsWith("M"), Collectors.toSet())));
        // System.out.println(collect);
        // names.stream().collect(Collectors.);
        // double[] arr = { 11.33, 44.55, 54.11, 39.92, 88.2 };
        // DoubleStream stream = Arrays.stream(arr);
        // stream.forEach(System.out::println);
        // Map<Boolean, List<String>> collect = names.stream()
        // .collect(Collectors.partitioningBy(name -> name.length() > 5));

        // TreeMap<Integer, Long> collect = names.stream()
        // .collect(
        // Collectors.groupingBy(
        // name -> name.length(),
        // TreeMap::new,
        // Collectors.counting()
        // )
        // );
        // System.out.println(collect);
        // System.out.println(names.stream().filter(name -> name.length() >
        // 5).collect(Collectors.toList()));
        // Stream<String> filteredNames = names.stream().filter(name ->
        // name.startsWith("M"));
        // // System.out.println(filteredNames.collect(Collectors.toList()));
        // Stream<String> distinctNames = filteredNames.distinct();
        // System.out.println(distinctNames.collect(Collectors.toList()));
        // List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
        // System.out.println(sorted);

        // Stream<Integer> stream = list.stream();
        // System.err.println(stream);
        // String[] arr = { "A", "B", "C", "D" };
        // Arrays.stream(arr).forEach(x -> System.out.println(x));

        // System.err.println(collect);

        // Stream<String> stream2 = Stream.of("Deepu", "rahul", "Manish", "Manoj");
        // List<String> collect2 = stream2.filter(name ->
        // name.startsWith("M")).collect(Collectors.toList());
        // System.out.println(collect2);

        // Stream<Integer> stream3 = Stream.generate(() -> 1).limit(10);
        // System.out.println(stream3.collect(Collectors.toList()));

        // List<Integer> collect = Stream.iterate(1, x -> x +
        // 1).limit(10).collect(Collectors.toList());
        // System.err.println(collect);

    }
}
