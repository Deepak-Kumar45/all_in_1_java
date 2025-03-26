package com.topics.multithreading;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample {
    public static void main(String[] args) {

        int numberOfThreads = 1000000;
        List<Thread> threads = new ArrayList<>();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Fetching data from Url>>>");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
        };

        // for (int i = 0; i < numberOfThreads; i++) {
        // Thread thread = Thread.ofVirtual().unstarted(task);
        // thread.setName("Thread-" + (i + 1));
        // // thread.setDaemon(true); // By default virtual threads are Daemon threads
        // thread.start();
        // threads.add(thread);
        // }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
            }
            System.out.println(thread.getName() + " is completed.");
        }

    }
}
