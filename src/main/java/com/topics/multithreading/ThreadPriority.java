package com.topics.multithreading;

public class ThreadPriority extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Priority - " + Thread.currentThread().getPriority()
                    + " count - " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadPriority thread1 = new ThreadPriority();
        thread1.setName("High priority thread");
        thread1.setPriority(Thread.MAX_PRIORITY);

        ThreadPriority thread2 = new ThreadPriority();
        thread2.setName("Normal priority thread");
        thread2.setPriority(Thread.NORM_PRIORITY);

        ThreadPriority thread3 = new ThreadPriority();
        thread3.setName("Low priority thread");
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        // thread3.start();
    }
}
