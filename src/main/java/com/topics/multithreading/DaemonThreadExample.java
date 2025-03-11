package com.topics.multithreading;

public class DaemonThreadExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Non Daemon thread displaying.." + i);
            }
        });
        t1.setDaemon(true);
        t1.start();
    }
}
