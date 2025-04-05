package com.topics.java8.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPICodingQuestions {
        public static void main(String[] args) {
                // Ques-1: find all even numbers
                List<Integer> list1 = List.of(10, 15, 8, 49, 25, 98, 32);
                System.out.println(
                                list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));

                // Ques-2: find out all the numbers starting with 1 using Stream functions?
                List<Integer> list2 = List.of(10, 15, 8, 49, 25, 98, 32);
                System.out.println(
                                list2.stream().filter(x -> x.toString().startsWith("1")).collect(Collectors.toList()));

                // Ques-3: How to find duplicate elements in a given integers list in java using
                // Stream functions?
                List<Integer> duplicate = list2.stream()
                                .collect(Collectors.groupingBy(x -> x))
                                .entrySet().stream()
                                .filter(entry -> entry.getValue().size() > 1)
                                .map(entry -> entry.getKey())
                                .collect(Collectors.toList());
                System.out.println(duplicate);

                // Ques-4: find the first element of the list using Stream functions?
                Integer firstValue = list2.stream().findFirst().get();
                System.out.println(firstValue);

                // Ques-5: find the total number of elements present in the list using Stream
                // functions?
                long count = list2.stream().count();
                System.out.println(count);

                // Ques-6: find the maximum value element present in it using Stream functions?
                Integer max = list2.stream().max(Comparator.naturalOrder()).get();
                System.out.println(max);

                // Ques-7: sort all the values present in it using Stream functions
                List<Integer> sorted = list2.stream().sorted().collect(Collectors.toList());
                System.out.println(sorted);

                // Ques-8: Print ten random numbers using forEach
                Stream.generate(() -> new Random().nextInt(10)).limit(10).forEach(x -> System.out.print(x + " "));
                System.out.println();

                // Ques-9: Count Strings whose length is greater than 3 in List?
                List<String> strings = List.of("Hello", "Interview", "Questions", "Answers", "Ram", "for");
                long greaterThan3 = strings.stream().filter(string -> string.length() > 3)
                                .collect(Collectors.counting());
                System.out.println(greaterThan3);

                // Ques-10: multiply 3 to all element in list and print the list
                List<Integer> numx3 = list2.stream().map(x -> x * 3).collect(Collectors.toList());
                System.out.println(numx3);

                // Ques-11: program to perform concatenation on two Streams?
                List<Integer> lst1 = List.of(1, 2, 3, 4);
                List<Integer> lst2 = List.of(5, 6, 7);
                List<Integer> contactedList = Stream.concat(lst1.stream(), lst2.stream()).collect(Collectors.toList());
                System.out.println(contactedList);

                // Ques-12: program to remove the duplicate elements from the list?
                List<Integer> list3 = List.of(1, 2, 3, 4, 1, 2, 3);
                List<Integer> unique = list3.stream().distinct().collect(Collectors.toList());
                System.out.println(unique);

        }
}
