package com.topics.multithreading;

public class ThreadLocalExample {

    public static void main(String[] args) {
        // Instance a thread inside of thread pool
        ThreadLocal<Long> userIds = new ThreadLocal<>();

        // Users coming from web applications
        Long user1 = 12345l;
        Long user2 = 67890l;
        Long user3 = 111213l;

        Thread t1 = new Thread(() -> {
            System.out.println("Starting thread for " + user1);
            userIds.set(user1);
            try {
                // Processing logic of handling request
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("Complete logic for " + userIds.get());
            userIds.remove();
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Starting thread for " + user2);
            userIds.set(user2);
            try {
                // Processing logic of handling request
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("Complete logic for " + userIds.get());
            userIds.remove();
        });

        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

        Thread t3 = new Thread(() -> {
            System.out.println("Starting thread for " + user3);
            userIds.set(user3);

            // Processing inner thread
            inheritableThreadLocal.set("Inner Thread");
            Thread innerThread = new Thread(() -> {
                System.out.println(inheritableThreadLocal.get());
            });

            innerThread.start();
            try {
                innerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("complete logic for " + userIds.get());
            userIds.remove();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
