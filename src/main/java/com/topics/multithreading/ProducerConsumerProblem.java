package com.topics.multithreading;

import java.util.List;

class Producer extends Thread {

    private List<Integer> items;

    public Producer(List<Integer> items) {
        this.items = items;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Produced item - " + i);
            items.add(i);
        }
    }
}

class Consumer extends Thread {

    private List<Integer> items;

    public Consumer(List<Integer> items) {
        this.items = items;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println("Consumed item - "+items.get(0));
        }
    }
}

public class ProducerConsumerProblem {

}
