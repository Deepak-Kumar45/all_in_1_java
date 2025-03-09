package com.topics.multithreading;

public class MainThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running....");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.err.println("Cause = " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println();

        MainThreadExample example = new MainThreadExample();
        example.setName("Example thread");
        example.start();
        example.interrupt();

        // System.out.println("Example of multithreading in java");
        // System.out.println("Currently executing thread is - " +
        // Thread.currentThread().getName());

        // UsingThread thread = new UsingThread();
        // System.out.println(thread.getState());
        // thread.start();

        // UsingRunnable usingRunnable = new UsingRunnable();
        // Thread thread2 = new Thread(usingRunnable);
        // thread2.start();

        System.out.println();
    }
}
