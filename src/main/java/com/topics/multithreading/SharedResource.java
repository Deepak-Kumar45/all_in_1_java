package com.topics.multithreading;

public class SharedResource {

    private static int counter = 0;

    public static synchronized void increment() {
        synchronized (SharedResource.class) {
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }

    private volatile boolean flag = false;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public synchronized boolean getFlag() {
        return flag;
    }

    // public void increment() {
    // synchronized (this) {
    // counter++;
    // }
    // }

}
