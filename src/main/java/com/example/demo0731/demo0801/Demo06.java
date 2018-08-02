package com.example.demo0731.demo0801;

/**
 * 并发、多线程
 */
public class Demo06 {
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        count++;
                    }
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();// 另当前线程等待所有线程执行
        }
        System.out.println(count);// 998051 1000000
    }
}
