package com.topics.java8.methodreference;

import java.util.List;

public class Provider {
    // static method
    public static void printData() {
        System.out.println(
                "Implementation provided by Provider class by refering the body of printData method using Method reference");
    }

    // static method
    public static void threadImpl() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 X " + i + " = " + 2 * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Non static method OR instance method.
    public void printList() {
        List<String> list = List.of("Deep", "Kumar", "Ruhi", "Verma");
        for (String name : list) {
            System.err.println(name);
        }
    }
}
