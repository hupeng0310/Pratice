package com.thread.runnable;

public class RunnableTest {
    public static void main(String[] args){
        new Thread(()-> System.out.println("这是测试")).start();
    }
}
