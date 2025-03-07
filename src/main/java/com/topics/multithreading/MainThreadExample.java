package com.topics.multithreading;

public class MainThreadExample {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Example of multithreading in java");
        System.out.println("Currently executing thread is - " + Thread.currentThread().getName());

        UsingThread thread = new UsingThread();
        System.out.println(thread.getState());
        thread.start();

        // UsingRunnable usingRunnable = new UsingRunnable();
        // Thread thread2 = new Thread(usingRunnable);
        // thread2.start();

        // System.out.println();
    }
}
