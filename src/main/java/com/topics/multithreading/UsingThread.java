package com.topics.multithreading;

public class UsingThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; 1 < 10; i++) {
            System.out.println("world " + i);
        }
    }
}
