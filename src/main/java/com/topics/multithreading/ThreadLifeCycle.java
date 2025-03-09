package com.topics.multithreading;

public class ThreadLifeCycle extends Thread {

    @Override
    public void run() {
        System.out.println("Thread state: RUNNING");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        ThreadLifeCycle thread = new ThreadLifeCycle();
        System.out.println("Thread state: " + thread.getState()); // NEW

        thread.start();
        System.out.println("Thread state: " + thread.getState()); // RUNNABLE

        Thread.sleep(1000); // Pausing main method from executing for 1 second
                            // So that our thread can executing

        System.out.println("Thread state: " + thread.getState()); // TIMED_WAITING

        thread.join(); // Waiting for thread to complete its execution
        System.out.println("Thread state: " + thread.getState()); // TERMINATED

    }

}
