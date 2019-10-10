package com.thread.runnable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("这是测试线程，基于实现了Runnable接口的MyRunnable类");
    }
}
