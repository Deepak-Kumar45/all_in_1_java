package com.topics.multithreading;

public class UsingRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; ; i++) {
            System.out.println("Hello " + i);
        }
    }
}
