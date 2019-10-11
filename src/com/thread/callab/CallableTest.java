package com.thread.callab;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args){
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //使用lambda表达式实现Callable接口
        Callable callable = ()-> {return "test";};
        Future future = executorService.submit(callable);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
