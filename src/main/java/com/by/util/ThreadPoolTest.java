package com.by.util;

import lombok.SneakyThrows;

import java.util.concurrent.*;

public class ThreadPoolTest {

    public static void main(String[] args) {
        final int[] num = {0};
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            }
        });
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    int c = num[0]++;
                    System.out.println(c);
                    Thread.sleep(100);
                }
            });
        }
        executor.shutdown();
    }

    public void TheadTest(){
        ThreadLocal local = new ThreadLocal();

    }
}
