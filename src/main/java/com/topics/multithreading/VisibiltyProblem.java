package com.topics.multithreading;

import ch.qos.logback.core.joran.conditional.ThenAction;

public class VisibiltyProblem {

    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        new Thread(() -> {
            System.err.println("Thread-1 starting");
            try {
                System.out.println("logic starts here...");
                Thread.sleep(1000);
                System.out.println("logic-1 ends here..");
                sharedResource.setFlag(true);
                System.err.println("flag is set to true");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.err.println("Thread-1 ends");
        }).start();

        new Thread(() -> {
            System.out.println("thread-2 starting");
            while (!sharedResource.getFlag()) {

            }
            System.out.println("thread-2 ends");
        }).start();

        // Thread t1 = new Thread(() -> {
        // for (int i = 0; i < 1000; i++) {
        // sharedResource.increment();
        // }
        // });

        // Thread t2 = new Thread(() -> {
        // for (int i = 0; i < 1000; i++) {
        // sharedResource.increment();
        // }
        // });

        // t1.start();
        // t2.start();

        // t1.join();
        // t2.join();

        // System.out.println(sharedResource.getCounter());
    }
}
