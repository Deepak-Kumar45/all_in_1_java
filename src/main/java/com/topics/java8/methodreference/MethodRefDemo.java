package com.topics.java8.methodreference;

import java.util.List;

public class MethodRefDemo {
    public static void main(String[] args) {

        // StudentService stdService = Student::new;

        // Student student = stdService.getStudent();
        // student.getStudentData();

        // List<Integer> list = List.of(12, 23, 4, 56, 78, 90);
        // list.forEach(System.out::println);

        // Provider provider = new Provider();
        // Runnable task = provider::printList;
        // Thread t2 = new Thread(task);
        // t2.start();

        // DoSomething doSomething = () -> {
        // System.out.println("Implementation provided by lambda expression");
        // };
        // doSomething.doingSomething();

        // DoSomething do2 = Provider::printData;
        // do2.doingSomething();

        Runnable task = Provider::threadImpl;

        Thread thread = new Thread(task);
        thread.start();
    }
}
