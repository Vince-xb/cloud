package com.by.algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tickets {

    public static void main(String[] args) {
        Queue<Ticket> tickets = new ArrayDeque<>();
        Producer producer = new Producer(tickets);
        Consumer consumer = new Consumer(tickets);
        producer.start();
        consumer.start();

    }


}

class Ticket {

}

class Producer extends Thread {
    private Queue<Ticket> tickets;
    private int maxSize = 10;

    public Producer(Queue<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {
        while (true) {
            Ticket ticket = new Ticket();
            synchronized (tickets) {
                while (tickets.size() == maxSize) {
                    try {
                        int restTime =1000*15;
                        System.out.println("生产完成");
                        System.out.println("休息" + restTime + "毫秒");
                        tickets.wait();
                        try {
                            Thread.sleep(restTime);//休息时间
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                tickets.add(ticket);
                System.out.println("生产者已生产 " + tickets.size() + "张票");
                if (tickets.size() == 10) {
                    tickets.notifyAll();
                }
            }

        }

    }
}

class Consumer extends Thread {
    private Queue<Ticket> tickets;

    public Consumer(Queue<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tickets) {
                while (tickets.isEmpty()) {
                    try {
                        System.out.println("票卖完了，等待生产");
                        tickets.wait();
                        tickets.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                tickets.remove();
                System.out.println("消费了一张票，还剩 " + tickets.size() + "张票");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
