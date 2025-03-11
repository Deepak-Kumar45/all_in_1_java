package com.topics.multithreading;

public class SharedResource {

    private boolean flag = false;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }

    private int counter = 0;

    // public void increment() {
    // synchronized (this) {
    // counter++;
    // }
    // }

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
