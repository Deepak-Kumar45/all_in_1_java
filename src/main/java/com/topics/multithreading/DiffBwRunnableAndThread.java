package com.topics.multithreading;

public class DiffBwRunnableAndThread extends MainThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("thread created using runnable interface");
    }
    public static void main(String[] args) {
        // This class is extending another class
        // So we cannot use Thread class for creating Thread
        // Due to no support of multiple inheritance in java
        // So instead we use Runnable Interface
        DiffBwRunnableAndThread obj = new DiffBwRunnableAndThread();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
