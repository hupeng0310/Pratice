package com.Thread.Runnable;

public class RunnableTest {
    public static void main(String[] args){
        new MyThread().start();
        new Thread(new MyRunnable()).start();
        new Thread(()-> System.out.println("这是测试线程，基于实现Runnable接口的lambda表达式")).start();
    }
}
